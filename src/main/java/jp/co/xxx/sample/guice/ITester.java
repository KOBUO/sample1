package jp.co.xxx.sample.guice;

import lombok.Getter;

import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface ITester {

    enum Status{
        SUCCESS(true), FAILED(false);
        @Getter
        @Accessors(prefix = "_")
        private final boolean _bol;
        Status(boolean bol){
            _bol = bol;
        }
        public static Status bolOf(boolean bol) {
            return Arrays.stream(Status.values()).filter(status -> status._bol == bol).findFirst().orElseThrow(RuntimeException::new);
        }
    }

    @Getter
    @Accessors(prefix = "_")
    class ResultInfo {
        private final Status _status;
        private final List<String> _messages;
        ResultInfo(Status status){
            _status = status;
            _messages = new ArrayList<>();
        }
        public ResultInfo addMsg(String message){
            this._messages.add(message);
            return this;
        }
    }

    ResultInfo test(boolean is);
}

package com.kvthv.EmoBot;

import java.util.List;

public interface Bot {
    public String getResponse();
    public String sendMessage(String message);
    public List<String> loadLibrary();
}

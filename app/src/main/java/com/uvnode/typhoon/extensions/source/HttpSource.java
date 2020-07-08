package com.uvnode.typhoon.extensions.source;

import com.uvnode.typhoon.extensions.executor.JSEClient;

import okhttp3.OkHttpClient;

public abstract class HttpSource extends MetaSource implements Rankable, Filterable {

    private OkHttpClient okClient;
    private JSEClient jseClient;

    public final OkHttpClient getOkClient() {
        return okClient;
    }

    public final JSEClient getJseClient() { return jseClient; };

    public void setOkClient(OkHttpClient okClient) {
        this.okClient = okClient;
    }

    public void setJSEClient(JSEClient jseClient) { this.jseClient = jseClient; }
}
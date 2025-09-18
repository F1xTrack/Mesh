package com.facebook.react.bridge;

import p000.InterfaceC0965PK;

@InterfaceC0965PK
/* loaded from: classes.dex */
public interface JavaJSExecutor {

    public interface Factory {
        JavaJSExecutor create() throws Exception;
    }

    public static class ProxyExecutorException extends Exception {
        public ProxyExecutorException(Throwable th) {
            super(th);
        }
    }

    void close();

    @InterfaceC0965PK
    String executeJSCall(String str, String str2) throws ProxyExecutorException;

    @InterfaceC0965PK
    void loadBundle(String str) throws ProxyExecutorException;

    @InterfaceC0965PK
    void setGlobalVariable(String str, String str2);
}

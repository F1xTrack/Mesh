package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p000.AbstractC1374Vq;
import p000.AbstractC3929dS;
import p000.InterfaceC0965PK;

@InterfaceC0965PK
/* loaded from: classes.dex */
public class Inspector {
    private final HybridData mHybridData;

    @InterfaceC0965PK
    public static class LocalConnection {
        private final HybridData mHybridData;

        private LocalConnection(HybridData hybridData) {
            this.mHybridData = hybridData;
        }

        public native void disconnect();

        public native void sendMessage(String str);
    }

    @InterfaceC0965PK
    public static class Page {
        private final int mId;
        private final String mTitle;
        private final String mVM;

        @InterfaceC0965PK
        private Page(int i, String str, String str2) {
            this.mId = i;
            this.mTitle = str;
            this.mVM = str2;
        }

        public int getId() {
            return this.mId;
        }

        public String getTitle() {
            return this.mTitle;
        }

        public String getVM() {
            return this.mVM;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Page{mId=");
            sb.append(this.mId);
            sb.append(", mTitle='");
            return AbstractC1374Vq.m8593l(sb, this.mTitle, "'}");
        }
    }

    @InterfaceC0965PK
    public interface RemoteConnection {
        @InterfaceC0965PK
        void onDisconnect();

        @InterfaceC0965PK
        void onMessage(String str);
    }

    static {
        ReactBridge.staticInit();
    }

    private Inspector(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public static LocalConnection connect(int i, RemoteConnection remoteConnection) {
        try {
            LocalConnection localConnectionConnectNative = instance().connectNative(i, remoteConnection);
            if (localConnectionConnectNative != null) {
                return localConnectionConnectNative;
            }
            throw new IllegalStateException("Can't open failed connection");
        } catch (UnsatisfiedLinkError e) {
            AbstractC3929dS.m17675h("ReactNative");
            throw new RuntimeException(e);
        }
    }

    private native LocalConnection connectNative(int i, RemoteConnection remoteConnection);

    public static List<Page> getPages() {
        try {
            return Arrays.asList(instance().getPagesNative());
        } catch (UnsatisfiedLinkError unused) {
            AbstractC3929dS.m17675h("ReactNative");
            return Collections.emptyList();
        }
    }

    private native Page[] getPagesNative();

    private static native Inspector instance();
}

package com.facebook.react.internal.turbomodule.core;

import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m22267d2 = {"Lcom/facebook/react/internal/turbomodule/core/NativeModuleSoLoader;", "", "()V", "Companion", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class NativeModuleSoLoader {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean isSoLibraryLoaded;

    @Metadata(m22266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m22267d2 = {"Lcom/facebook/react/internal/turbomodule/core/NativeModuleSoLoader$Companion;", "", "<init>", "()V", "LTf1;", "maybeLoadSoLibrary", "", "isSoLibraryLoaded", "Z", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized void maybeLoadSoLibrary() {
            if (!NativeModuleSoLoader.isSoLibraryLoaded) {
                SoLoader.m11076j("turbomodulejsijni");
                NativeModuleSoLoader.isSoLibraryLoaded = true;
            }
        }

        private Companion() {
        }
    }

    public static final synchronized void maybeLoadSoLibrary() {
        INSTANCE.maybeLoadSoLibrary();
    }
}

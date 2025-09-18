package com.facebook.react.bridge;

import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\r2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m22267d2 = {"Lcom/facebook/react/bridge/SoftAssertions;", "", "<init>", "()V", "", "message", "LTf1;", "assertUnreachable", "(Ljava/lang/String;)V", "", "condition", "assertCondition", "(ZLjava/lang/String;)V", "T", "instance", "assertNotNull", "(Ljava/lang/Object;)Ljava/lang/Object;", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class SoftAssertions {
    public static final SoftAssertions INSTANCE = new SoftAssertions();

    private SoftAssertions() {
    }

    public static final void assertCondition(boolean condition, String message) {
        O90.m5968f(message, "message");
        if (condition) {
            return;
        }
        ReactSoftExceptionLogger.logSoftException("SoftAssertions", new AssertionException(message));
    }

    public static final <T> T assertNotNull(T instance) {
        if (instance == null) {
            ReactSoftExceptionLogger.logSoftException("SoftAssertions", new AssertionException("Expected object to not be null!"));
        }
        return instance;
    }

    public static final void assertUnreachable(String message) {
        O90.m5968f(message, "message");
        ReactSoftExceptionLogger.logSoftException("SoftAssertions", new AssertionException(message));
    }
}

package io.sentry.android.core;

/* loaded from: classes2.dex */
public enum O {
    SENTRY_HANDLER_STRATEGY_DEFAULT(0),
    SENTRY_HANDLER_STRATEGY_CHAIN_AT_START(1);

    private final int value;

    O(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}

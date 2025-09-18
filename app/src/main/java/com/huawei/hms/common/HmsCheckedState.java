package com.huawei.hms.common;

/* loaded from: classes.dex */
public enum HmsCheckedState {
    UNCHECKED(0),
    NOT_NEED_UPDATE(1),
    NEED_UPDATE(2);


    /* renamed from: a */
    private final int f18871a;

    HmsCheckedState(int i) {
        this.f18871a = i;
    }

    public int getState() {
        return this.f18871a;
    }
}

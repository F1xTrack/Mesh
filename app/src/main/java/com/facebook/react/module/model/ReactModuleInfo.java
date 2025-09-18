package com.facebook.react.module.model;

import p000.O90;

/* loaded from: classes.dex */
public final class ReactModuleInfo {

    /* renamed from: a */
    public final String f17914a;

    /* renamed from: b */
    public final String f17915b;

    /* renamed from: c */
    public final boolean f17916c;

    /* renamed from: d */
    public final boolean f17917d;

    /* renamed from: e */
    public final boolean f17918e;

    /* renamed from: f */
    public final boolean f17919f;

    public ReactModuleInfo(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        O90.m5968f(str, "_name");
        this.f17914a = str;
        this.f17915b = str2;
        this.f17916c = z;
        this.f17917d = z2;
        this.f17918e = z3;
        this.f17919f = z4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactModuleInfo(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this(str, str2, z, z2, z3, z4);
        O90.m5968f(str, "name");
    }
}

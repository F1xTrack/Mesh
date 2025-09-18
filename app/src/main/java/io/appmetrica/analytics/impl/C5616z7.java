package io.appmetrica.analytics.impl;

import p000.O90;

/* renamed from: io.appmetrica.analytics.impl.z7 */
/* loaded from: classes2.dex */
public final class C5616z7 {

    /* renamed from: a */
    public final InterfaceC4491Fa f32914a;

    /* renamed from: b */
    public String f32915b = "";

    public C5616z7(InterfaceC4491Fa interfaceC4491Fa) {
        this.f32914a = interfaceC4491Fa;
    }

    /* renamed from: a */
    public final void m21232a(String str, boolean z) {
        if (str != null) {
            if ((str.length() > 0 ? str : null) == null || O90.m5963a(this.f32915b, str)) {
                return;
            }
            this.f32915b = str;
            this.f32914a.mo19407a(str, z);
        }
    }
}

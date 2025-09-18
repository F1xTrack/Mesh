package io.appmetrica.analytics.impl;

import defpackage.O90;

/* renamed from: io.appmetrica.analytics.impl.z7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5023z7 {
    public final Fa a;
    public String b = "";

    public C5023z7(Fa fa) {
        this.a = fa;
    }

    public final void a(String str, boolean z) {
        if (str != null) {
            if ((str.length() > 0 ? str : null) == null || O90.a(this.b, str)) {
                return;
            }
            this.b = str;
            this.a.a(str, z);
        }
    }
}

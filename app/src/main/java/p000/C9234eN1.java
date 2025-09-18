package p000;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: eN1 */
/* loaded from: classes.dex */
public final class C9234eN1 {

    /* renamed from: a */
    public final String f26681a;

    /* renamed from: b */
    public final boolean f26682b;

    /* renamed from: c */
    public boolean f26683c;

    /* renamed from: d */
    public boolean f26684d;

    /* renamed from: e */
    public final /* synthetic */ UM1 f26685e;

    public C9234eN1(UM1 um1, String str, boolean z) {
        this.f26685e = um1;
        Preconditions.checkNotEmpty(str);
        this.f26681a = str;
        this.f26682b = z;
    }

    /* renamed from: a */
    public final void m17920a(boolean z) {
        SharedPreferences.Editor editorEdit = this.f26685e.m7993C1().edit();
        editorEdit.putBoolean(this.f26681a, z);
        editorEdit.apply();
        this.f26684d = z;
    }

    /* renamed from: b */
    public final boolean m17921b() {
        if (!this.f26683c) {
            this.f26683c = true;
            this.f26684d = this.f26685e.m7993C1().getBoolean(this.f26681a, this.f26682b);
        }
        return this.f26684d;
    }
}

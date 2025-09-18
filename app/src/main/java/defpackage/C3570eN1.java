package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: eN1 */
/* loaded from: classes.dex */
public final class C3570eN1 {
    public final String a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ UM1 e;

    public C3570eN1(UM1 um1, String str, boolean z) {
        this.e = um1;
        Preconditions.checkNotEmpty(str);
        this.a = str;
        this.b = z;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor editorEdit = this.e.C1().edit();
        editorEdit.putBoolean(this.a, z);
        editorEdit.apply();
        this.d = z;
    }

    public final boolean b() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.C1().getBoolean(this.a, this.b);
        }
        return this.d;
    }
}

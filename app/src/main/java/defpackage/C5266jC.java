package defpackage;

import com.huawei.hms.actions.SearchIntents;

/* renamed from: jC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5266jC implements F61 {
    public String a;

    public /* synthetic */ C5266jC(String str, boolean z) {
        this.a = str;
    }

    @Override // defpackage.F61
    public String m() {
        return this.a;
    }

    public C5266jC(String str) {
        O90.f(str, SearchIntents.EXTRA_QUERY);
        this.a = str;
    }

    @Override // defpackage.F61
    public void n(E61 e61) {
    }
}

package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class LG1 extends AbstractRunnableC7951xG1 {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ CG1 i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LG1(CG1 cg1, String str, String str2, Object obj, boolean z, int i) {
        super(cg1, true);
        this.e = i;
        this.f = str;
        this.g = str2;
        this.j = obj;
        this.h = z;
        this.i = cg1;
    }

    @Override // defpackage.AbstractRunnableC7951xG1
    public final void a() {
        switch (this.e) {
            case 0:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(this.i.h)).setUserProperty(this.f, this.g, new BinderC2421bx0((String) this.j), this.h, this.a);
                break;
            case 1:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(this.i.h)).getUserProperties(this.f, this.g, this.h, (BinderC3546eF1) this.j);
                break;
            default:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(this.i.h)).logEvent(this.f, this.g, (Bundle) this.j, this.h, true, this.a);
                break;
        }
    }

    @Override // defpackage.AbstractRunnableC7951xG1
    public void b() {
        switch (this.e) {
            case 1:
                ((BinderC3546eF1) this.j).zza(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LG1(CG1 cg1, String str, String str2, boolean z, BinderC3546eF1 binderC3546eF1) {
        super(cg1, true);
        this.e = 1;
        this.f = str;
        this.g = str2;
        this.h = z;
        this.j = binderC3546eF1;
        this.i = cg1;
    }
}

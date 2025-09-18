package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class TG1 extends AbstractRunnableC7951xG1 {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ CG1 h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TG1(CG1 cg1, String str, String str2, Object obj, int i) {
        super(cg1, true);
        this.e = i;
        this.f = str;
        this.g = str2;
        this.i = obj;
        this.h = cg1;
    }

    @Override // defpackage.AbstractRunnableC7951xG1
    public final void a() {
        switch (this.e) {
            case 0:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(this.h.h)).clearConditionalUserProperty(this.f, this.g, (Bundle) this.i);
                break;
            case 1:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(this.h.h)).getConditionalUserProperties(this.f, this.g, (BinderC3546eF1) this.i);
                break;
            default:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(this.h.h)).setCurrentScreenByScionActivityInfo((C7380uG1) this.i, this.f, this.g, this.a);
                break;
        }
    }

    @Override // defpackage.AbstractRunnableC7951xG1
    public void b() {
        switch (this.e) {
            case 1:
                ((BinderC3546eF1) this.i).zza(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TG1(CG1 cg1, C7380uG1 c7380uG1, String str, String str2) {
        super(cg1, true);
        this.e = 2;
        this.i = c7380uG1;
        this.f = str;
        this.g = str2;
        this.h = cg1;
    }
}

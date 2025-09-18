package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class TG1 extends AbstractRunnableC11650xG1 {

    /* renamed from: e */
    public final /* synthetic */ int f11281e;

    /* renamed from: f */
    public final /* synthetic */ String f11282f;

    /* renamed from: g */
    public final /* synthetic */ String f11283g;

    /* renamed from: h */
    public final /* synthetic */ CG1 f11284h;

    /* renamed from: i */
    public final /* synthetic */ Object f11285i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TG1(CG1 cg1, String str, String str2, Object obj, int i) {
        super(cg1, true);
        this.f11281e = i;
        this.f11282f = str;
        this.f11283g = str2;
        this.f11285i = obj;
        this.f11284h = cg1;
    }

    @Override // p000.AbstractRunnableC11650xG1
    /* renamed from: a */
    public final void mo1137a() {
        switch (this.f11281e) {
            case 0:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(this.f11284h.f1294h)).clearConditionalUserProperty(this.f11282f, this.f11283g, (Bundle) this.f11285i);
                break;
            case 1:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(this.f11284h.f1294h)).getConditionalUserProperties(this.f11282f, this.f11283g, (BinderC9218eF1) this.f11285i);
                break;
            default:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(this.f11284h.f1294h)).setCurrentScreenByScionActivityInfo((C11268uG1) this.f11285i, this.f11282f, this.f11283g, this.f45510a);
                break;
        }
    }

    @Override // p000.AbstractRunnableC11650xG1
    /* renamed from: b */
    public void mo4940b() {
        switch (this.f11281e) {
            case 1:
                ((BinderC9218eF1) this.f11285i).zza(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TG1(CG1 cg1, C11268uG1 c11268uG1, String str, String str2) {
        super(cg1, true);
        this.f11281e = 2;
        this.f11285i = c11268uG1;
        this.f11282f = str;
        this.f11283g = str2;
        this.f11284h = cg1;
    }
}

package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class LG1 extends AbstractRunnableC11650xG1 {

    /* renamed from: e */
    public final /* synthetic */ int f6585e;

    /* renamed from: f */
    public final /* synthetic */ String f6586f;

    /* renamed from: g */
    public final /* synthetic */ String f6587g;

    /* renamed from: h */
    public final /* synthetic */ boolean f6588h;

    /* renamed from: i */
    public final /* synthetic */ CG1 f6589i;

    /* renamed from: j */
    public final /* synthetic */ Object f6590j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LG1(CG1 cg1, String str, String str2, Object obj, boolean z, int i) {
        super(cg1, true);
        this.f6585e = i;
        this.f6586f = str;
        this.f6587g = str2;
        this.f6590j = obj;
        this.f6588h = z;
        this.f6589i = cg1;
    }

    @Override // p000.AbstractRunnableC11650xG1
    /* renamed from: a */
    public final void mo1137a() {
        switch (this.f6585e) {
            case 0:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(this.f6589i.f1294h)).setUserProperty(this.f6586f, this.f6587g, new BinderC8916bx0((String) this.f6590j), this.f6588h, this.f45510a);
                break;
            case 1:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(this.f6589i.f1294h)).getUserProperties(this.f6586f, this.f6587g, this.f6588h, (BinderC9218eF1) this.f6590j);
                break;
            default:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(this.f6589i.f1294h)).logEvent(this.f6586f, this.f6587g, (Bundle) this.f6590j, this.f6588h, true, this.f45510a);
                break;
        }
    }

    @Override // p000.AbstractRunnableC11650xG1
    /* renamed from: b */
    public void mo4940b() {
        switch (this.f6585e) {
            case 1:
                ((BinderC9218eF1) this.f6590j).zza(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LG1(CG1 cg1, String str, String str2, boolean z, BinderC9218eF1 binderC9218eF1) {
        super(cg1, true);
        this.f6585e = 1;
        this.f6586f = str;
        this.f6587g = str2;
        this.f6588h = z;
        this.f6590j = binderC9218eF1;
        this.f6589i = cg1;
    }
}

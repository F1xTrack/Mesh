package p000;

import android.text.TextUtils;
import android.view.View;

/* renamed from: ck1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9019ck1 extends AbstractC8768an0 {

    /* renamed from: e */
    public final /* synthetic */ int f17720e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9019ck1(int i, Class cls, int i2, int i3, int i4) {
        super(i, cls, i2, i3);
        this.f17720e = i4;
    }

    @Override // p000.AbstractC8768an0
    /* renamed from: b */
    public final Object mo9814b(View view) {
        switch (this.f17720e) {
            case 0:
                return Boolean.valueOf(AbstractC10048kk1.m22254d(view));
            case 1:
                return AbstractC10048kk1.m22252b(view);
            case 2:
                return AbstractC10304mk1.m22938b(view);
            default:
                return Boolean.valueOf(AbstractC10048kk1.m22253c(view));
        }
    }

    @Override // p000.AbstractC8768an0
    /* renamed from: c */
    public final void mo9815c(View view, Object obj) {
        switch (this.f17720e) {
            case 0:
                AbstractC10048kk1.m22260j(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                AbstractC10048kk1.m22258h(view, (CharSequence) obj);
                break;
            case 2:
                AbstractC10304mk1.m22942f(view, (CharSequence) obj);
                break;
            default:
                AbstractC10048kk1.m22257g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // p000.AbstractC8768an0
    /* renamed from: f */
    public final boolean mo9818f(Object obj, Object obj2) {
        switch (this.f17720e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            case 2:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}

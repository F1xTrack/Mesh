package defpackage;

import android.text.TextUtils;
import android.view.View;

/* renamed from: ck1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2573ck1 extends AbstractC2200an0 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2573ck1(int i, Class cls, int i2, int i3, int i4) {
        super(i, cls, i2, i3);
        this.e = i4;
    }

    @Override // defpackage.AbstractC2200an0
    public final Object b(View view) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(AbstractC5561kk1.d(view));
            case 1:
                return AbstractC5561kk1.b(view);
            case 2:
                return AbstractC5943mk1.b(view);
            default:
                return Boolean.valueOf(AbstractC5561kk1.c(view));
        }
    }

    @Override // defpackage.AbstractC2200an0
    public final void c(View view, Object obj) {
        switch (this.e) {
            case 0:
                AbstractC5561kk1.j(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                AbstractC5561kk1.h(view, (CharSequence) obj);
                break;
            case 2:
                AbstractC5943mk1.f(view, (CharSequence) obj);
                break;
            default:
                AbstractC5561kk1.g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // defpackage.AbstractC2200an0
    public final boolean f(Object obj, Object obj2) {
        switch (this.e) {
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

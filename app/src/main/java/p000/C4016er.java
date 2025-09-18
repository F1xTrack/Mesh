package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: er */
/* loaded from: classes.dex */
public final class C4016er extends Property {

    /* renamed from: a */
    public final /* synthetic */ int f26917a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4016er(String str, int i, Class cls) {
        super(cls, str);
        this.f26917a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f26917a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((AbstractC11378v71) obj).f44206z);
            case 6:
                return Float.valueOf(AbstractC11966zl1.f46983a.mo3150b((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f26917a) {
            case 0:
                C4205hr c4205hr = (C4205hr) obj;
                PointF pointF = (PointF) obj2;
                c4205hr.getClass();
                c4205hr.f28624a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c4205hr.f28625b = iRound;
                int i = c4205hr.f28629f + 1;
                c4205hr.f28629f = i;
                if (i == c4205hr.f28630g) {
                    AbstractC11966zl1.m26532a(c4205hr.f28628e, c4205hr.f28624a, iRound, c4205hr.f28626c, c4205hr.f28627d);
                    c4205hr.f28629f = 0;
                    c4205hr.f28630g = 0;
                    break;
                }
                break;
            case 1:
                C4205hr c4205hr2 = (C4205hr) obj;
                PointF pointF2 = (PointF) obj2;
                c4205hr2.getClass();
                c4205hr2.f28626c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c4205hr2.f28627d = iRound2;
                int i2 = c4205hr2.f28630g + 1;
                c4205hr2.f28630g = i2;
                if (c4205hr2.f28629f == i2) {
                    AbstractC11966zl1.m26532a(c4205hr2.f28628e, c4205hr2.f28624a, c4205hr2.f28625b, c4205hr2.f28626c, iRound2);
                    c4205hr2.f28629f = 0;
                    c4205hr2.f28630g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC11966zl1.m26532a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC11966zl1.m26532a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                AbstractC11966zl1.m26532a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                ((AbstractC11378v71) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 6:
                float fFloatValue = ((Float) obj2).floatValue();
                AbstractC11966zl1.f46983a.mo3151c((View) obj, fFloatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}

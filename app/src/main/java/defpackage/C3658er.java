package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: er, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3658er extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3658er(String str, int i, Class cls) {
        super(cls, str);
        this.a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
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
                return Float.valueOf(((AbstractC7544v71) obj).z);
            case 6:
                return Float.valueOf(AbstractC8424zl1.a.b((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                C4231hr c4231hr = (C4231hr) obj;
                PointF pointF = (PointF) obj2;
                c4231hr.getClass();
                c4231hr.a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c4231hr.b = iRound;
                int i = c4231hr.f + 1;
                c4231hr.f = i;
                if (i == c4231hr.g) {
                    AbstractC8424zl1.a(c4231hr.e, c4231hr.a, iRound, c4231hr.c, c4231hr.d);
                    c4231hr.f = 0;
                    c4231hr.g = 0;
                    break;
                }
                break;
            case 1:
                C4231hr c4231hr2 = (C4231hr) obj;
                PointF pointF2 = (PointF) obj2;
                c4231hr2.getClass();
                c4231hr2.c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c4231hr2.d = iRound2;
                int i2 = c4231hr2.g + 1;
                c4231hr2.g = i2;
                if (c4231hr2.f == i2) {
                    AbstractC8424zl1.a(c4231hr2.e, c4231hr2.a, c4231hr2.b, c4231hr2.c, iRound2);
                    c4231hr2.f = 0;
                    c4231hr2.g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC8424zl1.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC8424zl1.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                AbstractC8424zl1.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                ((AbstractC7544v71) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 6:
                float fFloatValue = ((Float) obj2).floatValue();
                AbstractC8424zl1.a.c((View) obj, fFloatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}

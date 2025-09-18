package p000;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import kotlin.KotlinVersion;

/* renamed from: Tg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8314Tg0 extends Paint {

    /* renamed from: a */
    public final /* synthetic */ int f11467a;

    public /* synthetic */ C8314Tg0() {
        this.f11467a = 0;
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        switch (this.f11467a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 30) {
                    PointF pointF = AbstractC8778as0.f16638a;
                    super.setAlpha(Math.max(0, Math.min(KotlinVersion.MAX_COMPONENT_VALUE, i)));
                    break;
                } else {
                    int color = getColor();
                    PointF pointF2 = AbstractC8778as0.f16638a;
                    setColor((Math.max(0, Math.min(KotlinVersion.MAX_COMPONENT_VALUE, i)) << 24) | (color & 16777215));
                    break;
                }
            default:
                super.setAlpha(i);
                break;
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
        switch (this.f11467a) {
            case 0:
                break;
            default:
                super.setTextLocales(localeList);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8314Tg0(int i, int i2) {
        super(i);
        this.f11467a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8314Tg0(PorterDuff.Mode mode) {
        super(1);
        this.f11467a = 0;
        setXfermode(new PorterDuffXfermode(mode));
    }

    /* renamed from: a */
    private final void m7725a(LocaleList localeList) {
    }
}

package defpackage;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import kotlin.KotlinVersion;

/* renamed from: Tg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1520Tg0 extends Paint {
    public final /* synthetic */ int a;

    public /* synthetic */ C1520Tg0() {
        this.a = 0;
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        switch (this.a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 30) {
                    PointF pointF = AbstractC2215as0.a;
                    super.setAlpha(Math.max(0, Math.min(KotlinVersion.MAX_COMPONENT_VALUE, i)));
                    break;
                } else {
                    int color = getColor();
                    PointF pointF2 = AbstractC2215as0.a;
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
        switch (this.a) {
            case 0:
                break;
            default:
                super.setTextLocales(localeList);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1520Tg0(int i, int i2) {
        super(i);
        this.a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1520Tg0(PorterDuff.Mode mode) {
        super(1);
        this.a = 0;
        setXfermode(new PorterDuffXfermode(mode));
    }

    private final void a(LocaleList localeList) {
    }
}

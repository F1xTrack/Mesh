package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: si1 */
/* loaded from: classes.dex */
public final class C11068si1 extends Drawable.ConstantState {

    /* renamed from: a */
    public int f42556a;

    /* renamed from: b */
    public C10940ri1 f42557b;

    /* renamed from: c */
    public ColorStateList f42558c;

    /* renamed from: d */
    public PorterDuff.Mode f42559d;

    /* renamed from: e */
    public boolean f42560e;

    /* renamed from: f */
    public Bitmap f42561f;

    /* renamed from: g */
    public ColorStateList f42562g;

    /* renamed from: h */
    public PorterDuff.Mode f42563h;

    /* renamed from: i */
    public int f42564i;

    /* renamed from: j */
    public boolean f42565j;

    /* renamed from: k */
    public boolean f42566k;

    /* renamed from: l */
    public Paint f42567l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f42556a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C11324ui1(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C11324ui1(this);
    }
}

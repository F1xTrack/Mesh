package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: O6 */
/* loaded from: classes.dex */
public class C0888O6 extends ImageView {

    /* renamed from: a */
    public final C4218i3 f8228a;

    /* renamed from: b */
    public final C1356VY f8229b;

    /* renamed from: c */
    public boolean f8230c;

    public C0888O6(Context context) {
        this(context, null, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C4218i3 c4218i3 = this.f8228a;
        if (c4218i3 != null) {
            c4218i3.m18937a();
        }
        C1356VY c1356vy = this.f8229b;
        if (c1356vy != null) {
            c1356vy.m8490c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C4218i3 c4218i3 = this.f8228a;
        if (c4218i3 != null) {
            return c4218i3.m18944i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C4218i3 c4218i3 = this.f8228a;
        if (c4218i3 != null) {
            return c4218i3.m18945j();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C6649px c6649px;
        C1356VY c1356vy = this.f8229b;
        if (c1356vy == null || (c6649px = (C6649px) c1356vy.f12613d) == null) {
            return null;
        }
        return (ColorStateList) c6649px.f40447c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C6649px c6649px;
        C1356VY c1356vy = this.f8229b;
        if (c1356vy == null || (c6649px = (C6649px) c1356vy.f12613d) == null) {
            return null;
        }
        return (PorterDuff.Mode) c6649px.f40448d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f8229b.f12612c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C4218i3 c4218i3 = this.f8228a;
        if (c4218i3 != null) {
            c4218i3.m18950o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C4218i3 c4218i3 = this.f8228a;
        if (c4218i3 != null) {
            c4218i3.m18951p(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1356VY c1356vy = this.f8229b;
        if (c1356vy != null) {
            c1356vy.m8490c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C1356VY c1356vy = this.f8229b;
        if (c1356vy != null && drawable != null && !this.f8230c) {
            c1356vy.f12611b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c1356vy != null) {
            c1356vy.m8490c();
            if (this.f8230c) {
                return;
            }
            ImageView imageView = (ImageView) c1356vy.f12612c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c1356vy.f12611b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f8230c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C1356VY c1356vy = this.f8229b;
        if (c1356vy != null) {
            ImageView imageView = (ImageView) c1356vy.f12612c;
            if (i != 0) {
                Drawable drawableM26394b = AbstractC11918zN1.m26394b(imageView.getContext(), i);
                if (drawableM26394b != null) {
                    AbstractC6737rL.m24315a(drawableM26394b);
                }
                imageView.setImageDrawable(drawableM26394b);
            } else {
                imageView.setImageDrawable(null);
            }
            c1356vy.m8490c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1356VY c1356vy = this.f8229b;
        if (c1356vy != null) {
            c1356vy.m8490c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C4218i3 c4218i3 = this.f8228a;
        if (c4218i3 != null) {
            c4218i3.m18956u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C4218i3 c4218i3 = this.f8228a;
        if (c4218i3 != null) {
            c4218i3.m18957v(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C1356VY c1356vy = this.f8229b;
        if (c1356vy != null) {
            if (((C6649px) c1356vy.f12613d) == null) {
                c1356vy.f12613d = new C6649px();
            }
            C6649px c6649px = (C6649px) c1356vy.f12613d;
            c6649px.f40447c = colorStateList;
            c6649px.f40446b = true;
            c1356vy.m8490c();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C1356VY c1356vy = this.f8229b;
        if (c1356vy != null) {
            if (((C6649px) c1356vy.f12613d) == null) {
                c1356vy.f12613d = new C6649px();
            }
            C6649px c6649px = (C6649px) c1356vy.f12613d;
            c6649px.f40448d = mode;
            c6649px.f40445a = true;
            c1356vy.m8490c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0888O6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC7835Ka1.m4676a(context);
        this.f8230c = false;
        R91.m6917a(this, getContext());
        C4218i3 c4218i3 = new C4218i3(this);
        this.f8228a = c4218i3;
        c4218i3.m18947l(attributeSet, i);
        C1356VY c1356vy = new C1356VY((ImageView) this);
        this.f8229b = c1356vy;
        c1356vy.m8480R(attributeSet, i);
    }
}

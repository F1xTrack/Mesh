package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class N6 extends ImageButton {
    public final C4271i3 a;
    public final VY b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC0802Ka1.a(context);
        this.c = false;
        R91.a(this, getContext());
        C4271i3 c4271i3 = new C4271i3(this);
        this.a = c4271i3;
        c4271i3.l(attributeSet, i);
        VY vy = new VY((ImageView) this);
        this.b = vy;
        vy.R(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C4271i3 c4271i3 = this.a;
        if (c4271i3 != null) {
            c4271i3.a();
        }
        VY vy = this.b;
        if (vy != null) {
            vy.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C4271i3 c4271i3 = this.a;
        if (c4271i3 != null) {
            return c4271i3.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C4271i3 c4271i3 = this.a;
        if (c4271i3 != null) {
            return c4271i3.j();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C6553px c6553px;
        VY vy = this.b;
        if (vy == null || (c6553px = (C6553px) vy.d) == null) {
            return null;
        }
        return (ColorStateList) c6553px.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C6553px c6553px;
        VY vy = this.b;
        if (vy == null || (c6553px = (C6553px) vy.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) c6553px.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.b.c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C4271i3 c4271i3 = this.a;
        if (c4271i3 != null) {
            c4271i3.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C4271i3 c4271i3 = this.a;
        if (c4271i3 != null) {
            c4271i3.p(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        VY vy = this.b;
        if (vy != null) {
            vy.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        VY vy = this.b;
        if (vy != null && drawable != null && !this.c) {
            vy.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (vy != null) {
            vy.c();
            if (this.c) {
                return;
            }
            ImageView imageView = (ImageView) vy.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(vy.b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        VY vy = this.b;
        ImageView imageView = (ImageView) vy.c;
        if (i != 0) {
            Drawable drawableB = AbstractC8352zN1.b(imageView.getContext(), i);
            if (drawableB != null) {
                AbstractC6820rL.a(drawableB);
            }
            imageView.setImageDrawable(drawableB);
        } else {
            imageView.setImageDrawable(null);
        }
        vy.c();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        VY vy = this.b;
        if (vy != null) {
            vy.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C4271i3 c4271i3 = this.a;
        if (c4271i3 != null) {
            c4271i3.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C4271i3 c4271i3 = this.a;
        if (c4271i3 != null) {
            c4271i3.v(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        VY vy = this.b;
        if (vy != null) {
            if (((C6553px) vy.d) == null) {
                vy.d = new C6553px();
            }
            C6553px c6553px = (C6553px) vy.d;
            c6553px.c = colorStateList;
            c6553px.b = true;
            vy.c();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        VY vy = this.b;
        if (vy != null) {
            if (((C6553px) vy.d) == null) {
                vy.d = new C6553px();
            }
            C6553px c6553px = (C6553px) vy.d;
            c6553px.d = mode;
            c6553px.a = true;
            vy.c();
        }
    }
}

package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes.dex */
public class I3 {
    public final E3 a;
    public final int b;

    public I3(Context context) {
        this(context, J3.g(context, 0));
    }

    public void a(String str) {
        this.a.f = str;
    }

    public void b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        E3 e3 = this.a;
        e3.i = charSequence;
        e3.j = onClickListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public J3 create() {
        E3 e3 = this.a;
        J3 j3 = new J3(e3.a, this.b);
        View view = e3.e;
        H3 h3 = j3.f;
        if (view != null) {
            h3.w = view;
        } else {
            CharSequence charSequence = e3.d;
            if (charSequence != null) {
                h3.d = charSequence;
                TextView textView = h3.u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = e3.c;
            if (drawable != null) {
                h3.s = drawable;
                ImageView imageView = h3.t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    h3.t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = e3.f;
        if (charSequence2 != null) {
            h3.e = charSequence2;
            TextView textView2 = h3.v;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = e3.g;
        if (charSequence3 != null) {
            h3.c(-1, charSequence3, e3.h);
        }
        CharSequence charSequence4 = e3.i;
        if (charSequence4 != null) {
            h3.c(-2, charSequence4, e3.j);
        }
        String str = e3.k;
        if (str != null) {
            h3.c(-3, str, e3.l);
        }
        if (e3.o != null || e3.p != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) e3.b.inflate(h3.A, (ViewGroup) null);
            int i = e3.s ? h3.B : h3.C;
            Object obj = e3.p;
            ?? g3 = obj;
            if (obj == null) {
                g3 = new G3(e3.a, i, R.id.text1, e3.o);
            }
            h3.x = g3;
            h3.y = e3.t;
            if (e3.q != null) {
                alertController$RecycleListView.setOnItemClickListener(new D3(e3, h3));
            }
            if (e3.s) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            h3.f = alertController$RecycleListView;
        }
        View view2 = e3.r;
        if (view2 != null) {
            h3.g = view2;
            h3.h = false;
        }
        j3.setCancelable(true);
        j3.setCanceledOnTouchOutside(true);
        j3.setOnCancelListener(null);
        j3.setOnDismissListener(e3.m);
        DialogInterfaceOnKeyListenerC0303Dq0 dialogInterfaceOnKeyListenerC0303Dq0 = e3.n;
        if (dialogInterfaceOnKeyListenerC0303Dq0 != null) {
            j3.setOnKeyListener(dialogInterfaceOnKeyListenerC0303Dq0);
        }
        return j3;
    }

    public Context getContext() {
        return this.a.a;
    }

    public I3 setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        E3 e3 = this.a;
        e3.i = e3.a.getText(i);
        e3.j = onClickListener;
        return this;
    }

    public I3 setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        E3 e3 = this.a;
        e3.g = e3.a.getText(i);
        e3.h = onClickListener;
        return this;
    }

    public I3 setTitle(CharSequence charSequence) {
        this.a.d = charSequence;
        return this;
    }

    public I3 setView(View view) {
        this.a.r = view;
        return this;
    }

    public I3(Context context, int i) {
        this.a = new E3(new ContextThemeWrapper(context, J3.g(context, i)));
        this.b = i;
    }
}

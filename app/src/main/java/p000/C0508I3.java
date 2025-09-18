package p000;

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

/* renamed from: I3 */
/* loaded from: classes.dex */
public class C0508I3 {

    /* renamed from: a */
    public final C0256E3 f4670a;

    /* renamed from: b */
    public final int f4671b;

    public C0508I3(Context context) {
        this(context, DialogInterfaceC0571J3.m4145g(context, 0));
    }

    /* renamed from: a */
    public void mo3737a(String str) {
        this.f4670a.f2377f = str;
    }

    /* renamed from: b */
    public void m3738b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C0256E3 c0256e3 = this.f4670a;
        c0256e3.f2380i = charSequence;
        c0256e3.f2381j = onClickListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public DialogInterfaceC0571J3 create() {
        C0256E3 c0256e3 = this.f4670a;
        DialogInterfaceC0571J3 dialogInterfaceC0571J3 = new DialogInterfaceC0571J3(c0256e3.f2372a, this.f4671b);
        View view = c0256e3.f2376e;
        C0445H3 c0445h3 = dialogInterfaceC0571J3.f5292f;
        if (view != null) {
            c0445h3.f4025w = view;
        } else {
            CharSequence charSequence = c0256e3.f2375d;
            if (charSequence != null) {
                c0445h3.f4006d = charSequence;
                TextView textView = c0445h3.f4023u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0256e3.f2374c;
            if (drawable != null) {
                c0445h3.f4021s = drawable;
                ImageView imageView = c0445h3.f4022t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0445h3.f4022t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c0256e3.f2377f;
        if (charSequence2 != null) {
            c0445h3.f4007e = charSequence2;
            TextView textView2 = c0445h3.f4024v;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = c0256e3.f2378g;
        if (charSequence3 != null) {
            c0445h3.m3250c(-1, charSequence3, c0256e3.f2379h);
        }
        CharSequence charSequence4 = c0256e3.f2380i;
        if (charSequence4 != null) {
            c0445h3.m3250c(-2, charSequence4, c0256e3.f2381j);
        }
        String str = c0256e3.f2382k;
        if (str != null) {
            c0445h3.m3250c(-3, str, c0256e3.f2383l);
        }
        if (c0256e3.f2386o != null || c0256e3.f2387p != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0256e3.f2373b.inflate(c0445h3.f3997A, (ViewGroup) null);
            int i = c0256e3.f2390s ? c0445h3.f3998B : c0445h3.f3999C;
            Object obj = c0256e3.f2387p;
            ?? c0382g3 = obj;
            if (obj == null) {
                c0382g3 = new C0382G3(c0256e3.f2372a, i, R.id.text1, c0256e3.f2386o);
            }
            c0445h3.f4026x = c0382g3;
            c0445h3.f4027y = c0256e3.f2391t;
            if (c0256e3.f2388q != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0193D3(c0256e3, c0445h3));
            }
            if (c0256e3.f2390s) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0445h3.f4008f = alertController$RecycleListView;
        }
        View view2 = c0256e3.f2389r;
        if (view2 != null) {
            c0445h3.f4009g = view2;
            c0445h3.f4010h = false;
        }
        dialogInterfaceC0571J3.setCancelable(true);
        dialogInterfaceC0571J3.setCanceledOnTouchOutside(true);
        dialogInterfaceC0571J3.setOnCancelListener(null);
        dialogInterfaceC0571J3.setOnDismissListener(c0256e3.f2384m);
        DialogInterfaceOnKeyListenerC7502Dq0 dialogInterfaceOnKeyListenerC7502Dq0 = c0256e3.f2385n;
        if (dialogInterfaceOnKeyListenerC7502Dq0 != null) {
            dialogInterfaceC0571J3.setOnKeyListener(dialogInterfaceOnKeyListenerC7502Dq0);
        }
        return dialogInterfaceC0571J3;
    }

    public Context getContext() {
        return this.f4670a.f2372a;
    }

    public C0508I3 setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        C0256E3 c0256e3 = this.f4670a;
        c0256e3.f2380i = c0256e3.f2372a.getText(i);
        c0256e3.f2381j = onClickListener;
        return this;
    }

    public C0508I3 setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        C0256E3 c0256e3 = this.f4670a;
        c0256e3.f2378g = c0256e3.f2372a.getText(i);
        c0256e3.f2379h = onClickListener;
        return this;
    }

    public C0508I3 setTitle(CharSequence charSequence) {
        this.f4670a.f2375d = charSequence;
        return this;
    }

    public C0508I3 setView(View view) {
        this.f4670a.f2389r = view;
        return this;
    }

    public C0508I3(Context context, int i) {
        this.f4670a = new C0256E3(new ContextThemeWrapper(context, DialogInterfaceC0571J3.m4145g(context, i)));
        this.f4671b = i;
    }
}

package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import ru.mes.dnevnik.R;

/* renamed from: H3 */
/* loaded from: classes.dex */
public final class C0445H3 {

    /* renamed from: A */
    public final int f3997A;

    /* renamed from: B */
    public final int f3998B;

    /* renamed from: C */
    public final int f3999C;

    /* renamed from: D */
    public final boolean f4000D;

    /* renamed from: E */
    public final HandlerC0319F3 f4001E;

    /* renamed from: a */
    public final Context f4003a;

    /* renamed from: b */
    public final DialogInterfaceC0571J3 f4004b;

    /* renamed from: c */
    public final Window f4005c;

    /* renamed from: d */
    public CharSequence f4006d;

    /* renamed from: e */
    public CharSequence f4007e;

    /* renamed from: f */
    public AlertController$RecycleListView f4008f;

    /* renamed from: g */
    public View f4009g;

    /* renamed from: i */
    public Button f4011i;

    /* renamed from: j */
    public CharSequence f4012j;

    /* renamed from: k */
    public Message f4013k;

    /* renamed from: l */
    public Button f4014l;

    /* renamed from: m */
    public CharSequence f4015m;

    /* renamed from: n */
    public Message f4016n;

    /* renamed from: o */
    public Button f4017o;

    /* renamed from: p */
    public CharSequence f4018p;

    /* renamed from: q */
    public Message f4019q;

    /* renamed from: r */
    public NestedScrollView f4020r;

    /* renamed from: s */
    public Drawable f4021s;

    /* renamed from: t */
    public ImageView f4022t;

    /* renamed from: u */
    public TextView f4023u;

    /* renamed from: v */
    public TextView f4024v;

    /* renamed from: w */
    public View f4025w;

    /* renamed from: x */
    public ListAdapter f4026x;

    /* renamed from: z */
    public final int f4028z;

    /* renamed from: h */
    public boolean f4010h = false;

    /* renamed from: y */
    public int f4027y = -1;

    /* renamed from: F */
    public final ViewOnClickListenerC1822c2 f4002F = new ViewOnClickListenerC1822c2(1, this);

    public C0445H3(Context context, DialogInterfaceC0571J3 dialogInterfaceC0571J3, Window window) {
        this.f4003a = context;
        this.f4004b = dialogInterfaceC0571J3;
        this.f4005c = window;
        HandlerC0319F3 handlerC0319F3 = new HandlerC0319F3();
        handlerC0319F3.f3039b = new WeakReference(dialogInterfaceC0571J3);
        this.f4001E = handlerC0319F3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC8704aH0.f15427e, R.attr.alertDialogStyle, 0);
        this.f4028z = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f3997A = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f3998B = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f3999C = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f4000D = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC0571J3.m4146d().mo3282f(1);
    }

    /* renamed from: a */
    public static boolean m3248a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m3248a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static ViewGroup m3249b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: c */
    public final void m3250c(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.f4001E.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f4018p = charSequence;
            this.f4019q = messageObtainMessage;
        } else if (i == -2) {
            this.f4015m = charSequence;
            this.f4016n = messageObtainMessage;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f4012j = charSequence;
            this.f4013k = messageObtainMessage;
        }
    }
}

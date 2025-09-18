package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC1730l;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g;
import ru.mes.dnevnik.R;

/* renamed from: CU */
/* loaded from: classes.dex */
public class C0157CU extends DialogInterfaceOnCancelListenerC1725g {

    /* renamed from: a */
    public final Handler f1392a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final GR0 f1393b = new GR0(21, this);

    /* renamed from: c */
    public C0988Ph f1394c;

    /* renamed from: d */
    public int f1395d;

    /* renamed from: e */
    public int f1396e;

    /* renamed from: f */
    public ImageView f1397f;

    /* renamed from: g */
    public TextView f1398g;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C0988Ph c0988Ph = this.f1394c;
        if (c0988Ph.f9247x == null) {
            c0988Ph.f9247x = new C7560Et0();
        }
        C0988Ph.m6411i(c0988Ph.f9247x, Boolean.TRUE);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractActivityC1730l activity = getActivity();
        if (activity != null) {
            C0988Ph c0988Ph = (C0988Ph) new C10189lr0(activity).m22554L(C0988Ph.class);
            this.f1394c = c0988Ph;
            if (c0988Ph.f9249z == null) {
                c0988Ph.f9249z = new C7560Et0();
            }
            c0988Ph.f9249z.m10133e(this, new C7391Bm1(18, this));
            C0988Ph c0988Ph2 = this.f1394c;
            if (c0988Ph2.f9226A == null) {
                c0988Ph2.f9226A = new C7560Et0();
            }
            c0988Ph2.f9226A.m10133e(this, new C9432fw1(15, this));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1395d = m1191s(AbstractC0094BU.m730a());
        } else {
            Context context = getContext();
            this.f1395d = context != null ? AbstractC0691Ky.m4783a(context, R.color.biometric_error_color) : 0;
        }
        this.f1396e = m1191s(android.R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g
    public final Dialog onCreateDialog(Bundle bundle) {
        C0508I3 c0508i3 = new C0508I3(requireContext());
        C0674Kh c0674Kh = this.f1394c.f9229f;
        c0508i3.setTitle(c0674Kh != null ? c0674Kh.f6252a : null);
        View viewInflate = LayoutInflater.from(c0508i3.getContext()).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            C0674Kh c0674Kh2 = this.f1394c.f9229f;
            String str = c0674Kh2 != null ? c0674Kh2.f6253b : null;
            if (TextUtils.isEmpty(str)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(str);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            C0674Kh c0674Kh3 = this.f1394c.f9229f;
            String str2 = c0674Kh3 != null ? c0674Kh3.f6254c : null;
            if (TextUtils.isEmpty(str2)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(str2);
            }
        }
        this.f1397f = (ImageView) viewInflate.findViewById(R.id.fingerprint_icon);
        this.f1398g = (TextView) viewInflate.findViewById(R.id.fingerprint_error);
        c0508i3.m3738b(AbstractC10132lO1.m22420e(this.f1394c.m6412c()) ? getString(R.string.confirm_device_credential_password) : this.f1394c.m6413d(), new DialogInterfaceOnClickListenerC0925Oh(2, this));
        c0508i3.setView(viewInflate);
        DialogInterfaceC0571J3 dialogInterfaceC0571J3Create = c0508i3.create();
        dialogInterfaceC0571J3Create.setCanceledOnTouchOutside(false);
        return dialogInterfaceC0571J3Create;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f1392a.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C0988Ph c0988Ph = this.f1394c;
        c0988Ph.f9248y = 0;
        c0988Ph.m6416g(1);
        this.f1394c.m6415f(getString(R.string.fingerprint_dialog_touch_sensor));
    }

    /* renamed from: s */
    public final int m1191s(int i) throws Resources.NotFoundException {
        Context context = getContext();
        AbstractActivityC1730l activity = getActivity();
        if (context == null || activity == null) {
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }
}

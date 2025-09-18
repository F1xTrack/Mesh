package defpackage;

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
import androidx.fragment.app.g;
import androidx.fragment.app.l;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public class CU extends g {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final GR0 b = new GR0(21, this);
    public C1210Ph c;
    public int d;
    public int e;
    public ImageView f;
    public TextView g;

    @Override // androidx.fragment.app.g, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C1210Ph c1210Ph = this.c;
        if (c1210Ph.x == null) {
            c1210Ph.x = new C0390Et0();
        }
        C1210Ph.i(c1210Ph.x, Boolean.TRUE);
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l activity = getActivity();
        if (activity != null) {
            C1210Ph c1210Ph = (C1210Ph) new C5772lr0(activity).L(C1210Ph.class);
            this.c = c1210Ph;
            if (c1210Ph.z == null) {
                c1210Ph.z = new C0390Et0();
            }
            c1210Ph.z.e(this, new C0136Bm1(18, this));
            C1210Ph c1210Ph2 = this.c;
            if (c1210Ph2.A == null) {
                c1210Ph2.A = new C0390Et0();
            }
            c1210Ph2.A.e(this, new C3866fw1(15, this));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.d = s(BU.a());
        } else {
            Context context = getContext();
            this.d = context != null ? AbstractC0872Ky.a(context, R.color.biometric_error_color) : 0;
        }
        this.e = s(android.R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.g
    public final Dialog onCreateDialog(Bundle bundle) {
        I3 i3 = new I3(requireContext());
        C0821Kh c0821Kh = this.c.f;
        i3.setTitle(c0821Kh != null ? c0821Kh.a : null);
        View viewInflate = LayoutInflater.from(i3.getContext()).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            C0821Kh c0821Kh2 = this.c.f;
            String str = c0821Kh2 != null ? c0821Kh2.b : null;
            if (TextUtils.isEmpty(str)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(str);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            C0821Kh c0821Kh3 = this.c.f;
            String str2 = c0821Kh3 != null ? c0821Kh3.c : null;
            if (TextUtils.isEmpty(str2)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(str2);
            }
        }
        this.f = (ImageView) viewInflate.findViewById(R.id.fingerprint_icon);
        this.g = (TextView) viewInflate.findViewById(R.id.fingerprint_error);
        i3.b(AbstractC5686lO1.e(this.c.c()) ? getString(R.string.confirm_device_credential_password) : this.c.d(), new DialogInterfaceOnClickListenerC1132Oh(2, this));
        i3.setView(viewInflate);
        J3 j3Create = i3.create();
        j3Create.setCanceledOnTouchOutside(false);
        return j3Create;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.a.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1210Ph c1210Ph = this.c;
        c1210Ph.y = 0;
        c1210Ph.g(1);
        this.c.f(getString(R.string.fingerprint_dialog_touch_sensor));
    }

    public final int s(int i) throws Resources.NotFoundException {
        Context context = getContext();
        l activity = getActivity();
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

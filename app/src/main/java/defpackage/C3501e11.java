package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import ru.mes.dnevnik.R;

/* renamed from: e11, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3501e11 extends N91 {
    public final TextInputLayout a;
    public final String b;
    public final SimpleDateFormat c;
    public final C6898rl d;
    public final String e;
    public final RunnableC3529eA f;
    public RunnableC8009xa g;
    public int h = 0;
    public final /* synthetic */ C5191io0 i;
    public final /* synthetic */ TextInputLayout j;
    public final /* synthetic */ C3692f11 k;

    public C3501e11(C3692f11 c3692f11, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, C6898rl c6898rl, C5191io0 c5191io0, TextInputLayout textInputLayout2) {
        this.k = c3692f11;
        this.i = c5191io0;
        this.j = textInputLayout2;
        this.b = str;
        this.c = simpleDateFormat;
        this.a = textInputLayout;
        this.d = c6898rl;
        this.e = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.f = new RunnableC3529eA(this, 4, str);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) || editable.length() == 0) {
            return;
        }
        int length = editable.length();
        String str = this.b;
        if (length >= str.length() || editable.length() < this.h) {
            return;
        }
        char cCharAt = str.charAt(editable.length());
        if (Character.isLetterOrDigit(cCharAt)) {
            return;
        }
        editable.append(cCharAt);
    }

    @Override // defpackage.N91, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.h = charSequence.length();
    }

    @Override // defpackage.N91, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws ParseException {
        C6898rl c6898rl = this.d;
        TextInputLayout textInputLayout = this.a;
        RunnableC3529eA runnableC3529eA = this.f;
        textInputLayout.removeCallbacks(runnableC3529eA);
        textInputLayout.removeCallbacks(this.g);
        textInputLayout.setError(null);
        C3692f11 c3692f11 = this.k;
        c3692f11.a = null;
        c3692f11.getClass();
        Long l = c3692f11.a;
        C5191io0 c5191io0 = this.i;
        c5191io0.b(l);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.b.length()) {
            return;
        }
        try {
            Date date = this.c.parse(charSequence.toString());
            textInputLayout.setError(null);
            long time = date.getTime();
            if (c6898rl.c.S(time)) {
                Calendar calendarD = AbstractC6316oh1.d(c6898rl.a.a);
                calendarD.set(5, 1);
                if (calendarD.getTimeInMillis() <= time) {
                    C1478Ss0 c1478Ss0 = c6898rl.b;
                    int i4 = c1478Ss0.e;
                    Calendar calendarD2 = AbstractC6316oh1.d(c1478Ss0.a);
                    calendarD2.set(5, i4);
                    if (time <= calendarD2.getTimeInMillis()) {
                        c3692f11.a = Long.valueOf(date.getTime());
                        c3692f11.getClass();
                        c5191io0.b(c3692f11.a);
                        return;
                    }
                }
            }
            RunnableC8009xa runnableC8009xa = new RunnableC8009xa(this, time, 1);
            this.g = runnableC8009xa;
            textInputLayout.post(runnableC8009xa);
        } catch (ParseException unused) {
            textInputLayout.post(runnableC3529eA);
        }
    }
}

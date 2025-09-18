package p000;

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
public final class C9187e11 extends N91 {

    /* renamed from: a */
    public final TextInputLayout f26491a;

    /* renamed from: b */
    public final String f26492b;

    /* renamed from: c */
    public final SimpleDateFormat f26493c;

    /* renamed from: d */
    public final C6763rl f26494d;

    /* renamed from: e */
    public final String f26495e;

    /* renamed from: f */
    public final RunnableC3973eA f26496f;

    /* renamed from: g */
    public RunnableC7147xa f26497g;

    /* renamed from: h */
    public int f26498h = 0;

    /* renamed from: i */
    public final /* synthetic */ C9799io0 f26499i;

    /* renamed from: j */
    public final /* synthetic */ TextInputLayout f26500j;

    /* renamed from: k */
    public final /* synthetic */ C9315f11 f26501k;

    public C9187e11(C9315f11 c9315f11, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, C6763rl c6763rl, C9799io0 c9799io0, TextInputLayout textInputLayout2) {
        this.f26501k = c9315f11;
        this.f26499i = c9799io0;
        this.f26500j = textInputLayout2;
        this.f26492b = str;
        this.f26493c = simpleDateFormat;
        this.f26491a = textInputLayout;
        this.f26494d = c6763rl;
        this.f26495e = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.f26496f = new RunnableC3973eA(this, 4, str);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) || editable.length() == 0) {
            return;
        }
        int length = editable.length();
        String str = this.f26492b;
        if (length >= str.length() || editable.length() < this.f26498h) {
            return;
        }
        char cCharAt = str.charAt(editable.length());
        if (Character.isLetterOrDigit(cCharAt)) {
            return;
        }
        editable.append(cCharAt);
    }

    @Override // p000.N91, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f26498h = charSequence.length();
    }

    @Override // p000.N91, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws ParseException {
        C6763rl c6763rl = this.f26494d;
        TextInputLayout textInputLayout = this.f26491a;
        RunnableC3973eA runnableC3973eA = this.f26496f;
        textInputLayout.removeCallbacks(runnableC3973eA);
        textInputLayout.removeCallbacks(this.f26497g);
        textInputLayout.setError(null);
        C9315f11 c9315f11 = this.f26501k;
        c9315f11.f27015a = null;
        c9315f11.getClass();
        Long l = c9315f11.f27015a;
        C9799io0 c9799io0 = this.f26499i;
        c9799io0.m21930b(l);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.f26492b.length()) {
            return;
        }
        try {
            Date date = this.f26493c.parse(charSequence.toString());
            textInputLayout.setError(null);
            long time = date.getTime();
            if (c6763rl.f41850c.mo7464S(time)) {
                Calendar calendarM23523d = AbstractC10554oh1.m23523d(c6763rl.f41848a.f11016a);
                calendarM23523d.set(5, 1);
                if (calendarM23523d.getTimeInMillis() <= time) {
                    C8286Ss0 c8286Ss0 = c6763rl.f41849b;
                    int i4 = c8286Ss0.f11020e;
                    Calendar calendarM23523d2 = AbstractC10554oh1.m23523d(c8286Ss0.f11016a);
                    calendarM23523d2.set(5, i4);
                    if (time <= calendarM23523d2.getTimeInMillis()) {
                        c9315f11.f27015a = Long.valueOf(date.getTime());
                        c9315f11.getClass();
                        c9799io0.m21930b(c9315f11.f27015a);
                        return;
                    }
                }
            }
            RunnableC7147xa runnableC7147xa = new RunnableC7147xa(this, time, 1);
            this.f26497g = runnableC7147xa;
            textInputLayout.post(runnableC7147xa);
        } catch (ParseException unused) {
            textInputLayout.post(runnableC3973eA);
        }
    }
}

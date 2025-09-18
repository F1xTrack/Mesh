package p000;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* renamed from: Gq */
/* loaded from: classes.dex */
public final class C0431Gq {

    /* renamed from: a */
    public final ArrayList f3915a;

    /* renamed from: b */
    public final ArrayList f3916b;

    /* renamed from: c */
    public final StringBuilder f3917c;

    /* renamed from: d */
    public int f3918d;

    /* renamed from: e */
    public int f3919e;

    /* renamed from: f */
    public int f3920f;

    /* renamed from: g */
    public int f3921g;

    /* renamed from: h */
    public int f3922h;

    public C0431Gq(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.f3915a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f3916b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.f3917c = sb;
        this.f3921g = i;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.f3918d = 15;
        this.f3919e = 0;
        this.f3920f = 0;
        this.f3922h = i2;
    }

    /* renamed from: a */
    public final void m3176a(char c) {
        StringBuilder sb = this.f3917c;
        if (sb.length() < 32) {
            sb.append(c);
        }
    }

    /* renamed from: b */
    public final void m3177b() {
        StringBuilder sb = this.f3917c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.f3915a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C0368Fq c0368Fq = (C0368Fq) arrayList.get(size);
                int i = c0368Fq.f3438c;
                if (i != length) {
                    return;
                }
                c0368Fq.f3438c = i - 1;
            }
        }
    }

    /* renamed from: c */
    public final C6933uB m3178c(int i) {
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f3916b;
            if (i2 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i2));
            spannableStringBuilder.append('\n');
            i2++;
        }
        spannableStringBuilder.append((CharSequence) m3179d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i3 = this.f3919e + this.f3920f;
        int length = (32 - i3) - spannableStringBuilder.length();
        int i4 = i3 - length;
        int i5 = i != Integer.MIN_VALUE ? i : (this.f3921g != 2 || (Math.abs(i4) >= 3 && length >= 0)) ? (this.f3921g != 2 || i4 <= 0) ? 0 : 2 : 1;
        if (i5 != 1) {
            if (i5 == 2) {
                i3 = 32 - length;
            }
            f = ((i3 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        int i6 = this.f3918d;
        if (i6 > 7) {
            i6 -= 17;
        } else if (this.f3921g == 1) {
            i6 -= this.f3922h - 1;
        }
        return new C6933uB(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i6, 1, Integer.MIN_VALUE, f, i5, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    /* renamed from: d */
    public final SpannableString m3179d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f3917c);
        int length = spannableStringBuilder.length();
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.f3915a;
            if (i5 >= arrayList.size()) {
                break;
            }
            C0368Fq c0368Fq = (C0368Fq) arrayList.get(i5);
            boolean z2 = c0368Fq.f3437b;
            int i7 = c0368Fq.f3436a;
            if (i7 != 8) {
                boolean z3 = i7 == 7;
                if (i7 != 7) {
                    i4 = C0494Hq.f4523B[i7];
                }
                z = z3;
            }
            int i8 = c0368Fq.f3438c;
            i5++;
            if (i8 != (i5 < arrayList.size() ? ((C0368Fq) arrayList.get(i5)).f3438c : length)) {
                if (i != -1 && !z2) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, i8, 33);
                    i = -1;
                } else if (i == -1 && z2) {
                    i = i8;
                }
                if (i2 != -1 && !z) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i2, i8, 33);
                    i2 = -1;
                } else if (i2 == -1 && z) {
                    i2 = i8;
                }
                if (i4 != i3) {
                    if (i3 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, i8, 33);
                    }
                    i3 = i4;
                    i6 = i8;
                }
            }
        }
        if (i != -1 && i != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
        }
        if (i2 != -1 && i2 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
        }
        if (i6 != length && i3 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* renamed from: e */
    public final boolean m3180e() {
        return this.f3915a.isEmpty() && this.f3916b.isEmpty() && this.f3917c.length() == 0;
    }
}

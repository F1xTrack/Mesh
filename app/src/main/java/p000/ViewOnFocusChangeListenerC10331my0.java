package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: my0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnFocusChangeListenerC10331my0 implements TextWatcher, View.OnFocusChangeListener {

    /* renamed from: a */
    public String f38007a;

    /* renamed from: b */
    public int f38008b;

    /* renamed from: c */
    public final WeakReference f38009c;

    /* renamed from: d */
    public final String f38010d;

    /* renamed from: e */
    public final List f38011e;

    /* renamed from: f */
    public final List f38012f;

    /* renamed from: g */
    public final EnumC7240z3 f38013g;

    /* renamed from: h */
    public boolean f38014h;

    /* renamed from: i */
    public final boolean f38015i;

    /* renamed from: j */
    public final TextWatcher f38016j;

    /* renamed from: k */
    public final boolean f38017k;

    /* renamed from: l */
    public final View.OnFocusChangeListener f38018l;

    /* renamed from: m */
    public String f38019m;

    public ViewOnFocusChangeListenerC10331my0(String str, List list, List list2, EnumC7240z3 enumC7240z3, boolean z, boolean z2, EditText editText, boolean z3, View.OnFocusChangeListener onFocusChangeListener) {
        O90.m5968f(str, "primaryFormat");
        O90.m5968f(editText, "field");
        O90.m5969g(str, "primaryFormat");
        O90.m5969g(editText, "field");
        this.f38010d = str;
        this.f38011e = list;
        this.f38012f = list2;
        this.f38013g = enumC7240z3;
        this.f38014h = z;
        this.f38015i = z2;
        this.f38016j = null;
        this.f38017k = z3;
        this.f38007a = "";
        this.f38009c = new WeakReference(editText);
        this.f38018l = onFocusChangeListener;
    }

    /* renamed from: a */
    public final void m23030a(CharSequence charSequence, int i, int i2, int i3) {
        TextWatcher textWatcher = this.f38016j;
        if (textWatcher != null) {
            textWatcher.beforeTextChanged(charSequence, i, i2, i3);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        WeakReference weakReference = this.f38009c;
        EditText editText = (EditText) weakReference.get();
        if (editText != null) {
            editText.removeTextChangedListener(this);
        }
        if (editable != null) {
            editable.replace(0, editable.length(), this.f38007a);
        }
        EditText editText2 = (EditText) weakReference.get();
        if (editText2 != null) {
            editText2.setSelection(this.f38008b);
        }
        EditText editText3 = (EditText) weakReference.get();
        if (editText3 != null) {
            editText3.addTextChangedListener(this);
        }
        TextWatcher textWatcher = this.f38016j;
        if (textWatcher != null) {
            textWatcher.afterTextChanged(editable);
        }
    }

    /* renamed from: b */
    public final int m23031b(C11969zn0 c11969zn0, C6911tq c6911tq) {
        String strSubstring;
        int length;
        int iM26550d;
        int iOrdinal = this.f38013g.ordinal();
        if (iOrdinal == 0) {
            return c11969zn0.mo10446a(c6911tq).f45789c;
        }
        String str = c6911tq.f43353a;
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new C6838sg();
                }
                length = c11969zn0.mo10446a(c6911tq).f45788b.length();
                if (length > c11969zn0.m26551e()) {
                    return Integer.MIN_VALUE;
                }
                iM26550d = c11969zn0.m26551e();
            } else {
                if (str.length() > c11969zn0.m26550d()) {
                    return Integer.MIN_VALUE;
                }
                length = str.length();
                iM26550d = c11969zn0.m26550d();
            }
            return length - iM26550d;
        }
        String str2 = c11969zn0.mo10446a(c6911tq).f45787a.f43353a;
        if (str2.length() == 0 || str.length() == 0) {
            strSubstring = "";
        } else {
            int i = 0;
            while (i < str2.length() && i < str.length()) {
                if (str2.charAt(i) != str.charAt(i)) {
                    strSubstring = str2.substring(0, i);
                    O90.m5964b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    break;
                }
                i++;
            }
            strSubstring = str2.substring(0, i);
            O90.m5964b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        return strSubstring.length();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f38019m = charSequence != null ? charSequence.toString() : null;
        m23030a(charSequence, i, i2, i3);
    }

    /* renamed from: c */
    public final C11969zn0 m23032c(String str, List list) {
        if (this.f38017k) {
            HashMap map = C8836bJ0.f16971d;
            O90.m5969g(str, "format");
            HashMap map2 = C8836bJ0.f16971d;
            C8836bJ0 c8836bJ0 = (C8836bJ0) map2.get(AbstractC9620hO1.m18813a(str));
            if (c8836bJ0 != null) {
                return c8836bJ0;
            }
            C8836bJ0 c8836bJ02 = new C8836bJ0(AbstractC9620hO1.m18813a(str), list);
            map2.put(AbstractC9620hO1.m18813a(str), c8836bJ02);
            return c8836bJ02;
        }
        HashMap map3 = C11969zn0.f47005c;
        O90.m5969g(str, "format");
        HashMap map4 = C11969zn0.f47005c;
        C11969zn0 c11969zn0 = (C11969zn0) map4.get(str);
        if (c11969zn0 != null) {
            return c11969zn0;
        }
        C11969zn0 c11969zn02 = new C11969zn0(str, list);
        map4.put(str, c11969zn02);
        return c11969zn02;
    }

    /* renamed from: d */
    public final void m23033d(View view, boolean z) {
        String strValueOf;
        if (this.f38014h && z) {
            WeakReference weakReference = this.f38009c;
            EditText editText = (EditText) weakReference.get();
            Editable text = editText != null ? editText.getText() : null;
            if (text == null) {
                C7586Fg0 c7586Fg0 = new C7586Fg0();
                O90.m5975m(c7586Fg0, O90.class.getName());
                throw c7586Fg0;
            }
            if (text.length() == 0) {
                strValueOf = "";
            } else {
                EditText editText2 = (EditText) weakReference.get();
                strValueOf = String.valueOf(editText2 != null ? editText2.getText() : null);
            }
            C6911tq c6911tq = new C6911tq(strValueOf, strValueOf.length(), new C6848sq(this.f38014h));
            C6911tq c6911tq2 = m23035f(c6911tq).mo10446a(c6911tq).f45787a;
            this.f38007a = c6911tq2.f43353a;
            this.f38008b = c6911tq2.f43354b;
            EditText editText3 = (EditText) weakReference.get();
            if (editText3 != null) {
                editText3.setText(this.f38007a);
            }
            EditText editText4 = (EditText) weakReference.get();
            if (editText4 != null) {
                editText4.setSelection(c6911tq2.f43354b);
            }
        }
    }

    /* renamed from: e */
    public final void m23034e(CharSequence charSequence, int i, int i2, int i3) {
        O90.m5969g(charSequence, "text");
        boolean z = i2 > 0 && i3 == 0;
        AbstractC10396nS1 c6768rq = z ? new C6768rq(z ? this.f38015i : false) : new C6848sq(z ? false : this.f38014h);
        if (!z) {
            i += i3;
        }
        C6911tq c6911tq = new C6911tq(charSequence.toString(), i, c6768rq);
        C6911tq c6911tq2 = m23035f(c6911tq).mo10446a(c6911tq).f45787a;
        this.f38007a = c6911tq2.f43353a;
        this.f38008b = c6911tq2.f43354b;
    }

    /* renamed from: f */
    public final C11969zn0 m23035f(C6911tq c6911tq) {
        List list = this.f38011e;
        if (list.isEmpty()) {
            return m23032c(this.f38010d, this.f38012f);
        }
        int iM23031b = m23031b(m23032c(this.f38010d, this.f38012f), c6911tq);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C11969zn0 c11969zn0M23032c = m23032c((String) it.next(), this.f38012f);
            arrayList.add(new C7392Bn0(c11969zn0M23032c, m23031b(c11969zn0M23032c, c6911tq)));
        }
        if (arrayList.size() > 1) {
            AbstractC0183Cu.m1455l(arrayList, new C8774aq0(19));
        }
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            if (iM23031b >= ((C7392Bn0) it2.next()).f1026b) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            arrayList.add(i, new C7392Bn0(m23032c(this.f38010d, this.f38012f), iM23031b));
        } else {
            arrayList.add(new C7392Bn0(m23032c(this.f38010d, this.f38012f), iM23031b));
        }
        return ((C7392Bn0) AbstractC7167xu.m25955A(arrayList)).f1025a;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        m23033d(view, z);
        this.f38018l.onFocusChange(view, z);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String strSubstring;
        O90.m5968f(charSequence, "text");
        String string = charSequence.subSequence(i, i + i3).toString();
        String str = this.f38019m;
        if (str != null) {
            strSubstring = str.substring(i, i + i2);
            O90.m5967e(strSubstring, "substring(...)");
        } else {
            strSubstring = null;
        }
        boolean z = this.f38014h && i3 == i2 && O90.m5963a(string, strSubstring);
        if (z) {
            this.f38014h = false;
        }
        m23034e(charSequence, i, i2, i3);
        if (z) {
            this.f38014h = true;
        }
    }
}

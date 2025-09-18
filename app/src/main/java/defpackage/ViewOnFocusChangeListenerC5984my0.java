package defpackage;

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
public final class ViewOnFocusChangeListenerC5984my0 implements TextWatcher, View.OnFocusChangeListener {
    public String a;
    public int b;
    public final WeakReference c;
    public final String d;
    public final List e;
    public final List f;
    public final EnumC8290z3 g;
    public boolean h;
    public final boolean i;
    public final TextWatcher j;
    public final boolean k;
    public final View.OnFocusChangeListener l;
    public String m;

    public ViewOnFocusChangeListenerC5984my0(String str, List list, List list2, EnumC8290z3 enumC8290z3, boolean z, boolean z2, EditText editText, boolean z3, View.OnFocusChangeListener onFocusChangeListener) {
        O90.f(str, "primaryFormat");
        O90.f(editText, "field");
        O90.g(str, "primaryFormat");
        O90.g(editText, "field");
        this.d = str;
        this.e = list;
        this.f = list2;
        this.g = enumC8290z3;
        this.h = z;
        this.i = z2;
        this.j = null;
        this.k = z3;
        this.a = "";
        this.c = new WeakReference(editText);
        this.l = onFocusChangeListener;
    }

    public final void a(CharSequence charSequence, int i, int i2, int i3) {
        TextWatcher textWatcher = this.j;
        if (textWatcher != null) {
            textWatcher.beforeTextChanged(charSequence, i, i2, i3);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        WeakReference weakReference = this.c;
        EditText editText = (EditText) weakReference.get();
        if (editText != null) {
            editText.removeTextChangedListener(this);
        }
        if (editable != null) {
            editable.replace(0, editable.length(), this.a);
        }
        EditText editText2 = (EditText) weakReference.get();
        if (editText2 != null) {
            editText2.setSelection(this.b);
        }
        EditText editText3 = (EditText) weakReference.get();
        if (editText3 != null) {
            editText3.addTextChangedListener(this);
        }
        TextWatcher textWatcher = this.j;
        if (textWatcher != null) {
            textWatcher.afterTextChanged(editable);
        }
    }

    public final int b(C8429zn0 c8429zn0, C7295tq c7295tq) {
        String strSubstring;
        int length;
        int iD;
        int iOrdinal = this.g.ordinal();
        if (iOrdinal == 0) {
            return c8429zn0.a(c7295tq).c;
        }
        String str = c7295tq.a;
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new C7074sg();
                }
                length = c8429zn0.a(c7295tq).b.length();
                if (length > c8429zn0.e()) {
                    return Integer.MIN_VALUE;
                }
                iD = c8429zn0.e();
            } else {
                if (str.length() > c8429zn0.d()) {
                    return Integer.MIN_VALUE;
                }
                length = str.length();
                iD = c8429zn0.d();
            }
            return length - iD;
        }
        String str2 = c8429zn0.a(c7295tq).a.a;
        if (str2.length() == 0 || str.length() == 0) {
            strSubstring = "";
        } else {
            int i = 0;
            while (i < str2.length() && i < str.length()) {
                if (str2.charAt(i) != str.charAt(i)) {
                    strSubstring = str2.substring(0, i);
                    O90.b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    break;
                }
                i++;
            }
            strSubstring = str2.substring(0, i);
            O90.b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        return strSubstring.length();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.m = charSequence != null ? charSequence.toString() : null;
        a(charSequence, i, i2, i3);
    }

    public final C8429zn0 c(String str, List list) {
        if (this.k) {
            HashMap map = C2301bJ0.d;
            O90.g(str, "format");
            HashMap map2 = C2301bJ0.d;
            C2301bJ0 c2301bJ0 = (C2301bJ0) map2.get(AbstractC4146hO1.a(str));
            if (c2301bJ0 != null) {
                return c2301bJ0;
            }
            C2301bJ0 c2301bJ02 = new C2301bJ0(AbstractC4146hO1.a(str), list);
            map2.put(AbstractC4146hO1.a(str), c2301bJ02);
            return c2301bJ02;
        }
        HashMap map3 = C8429zn0.c;
        O90.g(str, "format");
        HashMap map4 = C8429zn0.c;
        C8429zn0 c8429zn0 = (C8429zn0) map4.get(str);
        if (c8429zn0 != null) {
            return c8429zn0;
        }
        C8429zn0 c8429zn02 = new C8429zn0(str, list);
        map4.put(str, c8429zn02);
        return c8429zn02;
    }

    public final void d(View view, boolean z) {
        String strValueOf;
        if (this.h && z) {
            WeakReference weakReference = this.c;
            EditText editText = (EditText) weakReference.get();
            Editable text = editText != null ? editText.getText() : null;
            if (text == null) {
                C0429Fg0 c0429Fg0 = new C0429Fg0();
                O90.m(c0429Fg0, O90.class.getName());
                throw c0429Fg0;
            }
            if (text.length() == 0) {
                strValueOf = "";
            } else {
                EditText editText2 = (EditText) weakReference.get();
                strValueOf = String.valueOf(editText2 != null ? editText2.getText() : null);
            }
            C7295tq c7295tq = new C7295tq(strValueOf, strValueOf.length(), new C7104sq(this.h));
            C7295tq c7295tq2 = f(c7295tq).a(c7295tq).a;
            this.a = c7295tq2.a;
            this.b = c7295tq2.b;
            EditText editText3 = (EditText) weakReference.get();
            if (editText3 != null) {
                editText3.setText(this.a);
            }
            EditText editText4 = (EditText) weakReference.get();
            if (editText4 != null) {
                editText4.setSelection(c7295tq2.b);
            }
        }
    }

    public final void e(CharSequence charSequence, int i, int i2, int i3) {
        O90.g(charSequence, "text");
        boolean z = i2 > 0 && i3 == 0;
        AbstractC6080nS1 c6913rq = z ? new C6913rq(z ? this.i : false) : new C7104sq(z ? false : this.h);
        if (!z) {
            i += i3;
        }
        C7295tq c7295tq = new C7295tq(charSequence.toString(), i, c6913rq);
        C7295tq c7295tq2 = f(c7295tq).a(c7295tq).a;
        this.a = c7295tq2.a;
        this.b = c7295tq2.b;
    }

    public final C8429zn0 f(C7295tq c7295tq) {
        List list = this.e;
        if (list.isEmpty()) {
            return c(this.d, this.f);
        }
        int iB = b(c(this.d, this.f), c7295tq);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C8429zn0 c8429zn0C = c((String) it.next(), this.f);
            arrayList.add(new C0138Bn0(c8429zn0C, b(c8429zn0C, c7295tq)));
        }
        if (arrayList.size() > 1) {
            AbstractC0236Cu.l(arrayList, new C2209aq0(19));
        }
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            if (iB >= ((C0138Bn0) it2.next()).b) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            arrayList.add(i, new C0138Bn0(c(this.d, this.f), iB));
        } else {
            arrayList.add(new C0138Bn0(c(this.d, this.f), iB));
        }
        return ((C0138Bn0) AbstractC8069xu.A(arrayList)).a;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        d(view, z);
        this.l.onFocusChange(view, z);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String strSubstring;
        O90.f(charSequence, "text");
        String string = charSequence.subSequence(i, i + i3).toString();
        String str = this.m;
        if (str != null) {
            strSubstring = str.substring(i, i + i2);
            O90.e(strSubstring, "substring(...)");
        } else {
            strSubstring = null;
        }
        boolean z = this.h && i3 == i2 && O90.a(string, strSubstring);
        if (z) {
            this.h = false;
        }
        e(charSequence, i, i2, i3);
        if (z) {
            this.h = true;
        }
    }
}

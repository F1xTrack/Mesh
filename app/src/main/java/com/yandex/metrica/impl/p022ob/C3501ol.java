package com.yandex.metrica.impl.p022ob;

import android.widget.CheckBox;
import android.widget.Chronometer;
import android.widget.DigitalClock;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextClock;
import android.widget.TextView;
import com.yandex.metrica.impl.p022ob.C3037Wl;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.ol */
/* loaded from: classes2.dex */
public class C3501ol implements InterfaceC2613Fl {

    /* renamed from: a */
    private final Set<Class> f24395a;

    public C3501ol() {
        HashSet hashSet = new HashSet();
        this.f24395a = hashSet;
        hashSet.add(EditText.class);
        hashSet.add(Chronometer.class);
        hashSet.add(DigitalClock.class);
        hashSet.add(TextClock.class);
        hashSet.add(RadioButton.class);
        hashSet.add(CheckBox.class);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3320hm
    /* renamed from: a */
    public boolean mo13972a(TextView textView) {
        TextView textView2 = textView;
        Iterator<Class> it = this.f24395a.iterator();
        while (it.hasNext()) {
            if (it.next().isInstance(textView2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3320hm
    /* renamed from: a */
    public C3037Wl.b mo13971a() {
        return C3037Wl.b.IRRELEVANT_CLASS;
    }
}

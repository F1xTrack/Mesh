package com.yandex.metrica.impl.ob;

import android.widget.CheckBox;
import android.widget.Chronometer;
import android.widget.DigitalClock;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextClock;
import android.widget.TextView;
import com.yandex.metrica.impl.ob.Wl;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.ol, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2985ol implements Fl {
    private final Set<Class> a;

    public C2985ol() {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        hashSet.add(EditText.class);
        hashSet.add(Chronometer.class);
        hashSet.add(DigitalClock.class);
        hashSet.add(TextClock.class);
        hashSet.add(RadioButton.class);
        hashSet.add(CheckBox.class);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2812hm
    public boolean a(TextView textView) {
        TextView textView2 = textView;
        Iterator<Class> it = this.a.iterator();
        while (it.hasNext()) {
            if (it.next().isInstance(textView2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2812hm
    public Wl.b a() {
        return Wl.b.IRRELEVANT_CLASS;
    }
}

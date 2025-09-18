package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import ru.mes.dnevnik.R;

/* renamed from: Gp1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7657Gp1 extends AbstractC10899rO0 {

    /* renamed from: d */
    public final C8898bo0 f3914d;

    public C7657Gp1(C8898bo0 c8898bo0) {
        this.f3914d = c8898bo0;
    }

    @Override // p000.AbstractC10899rO0
    /* renamed from: a */
    public final int mo3173a() {
        return this.f3914d.f17162d.f41853f;
    }

    @Override // p000.AbstractC10899rO0
    /* renamed from: c */
    public final void mo3174c(OO0 oo0, int i) {
        C8898bo0 c8898bo0 = this.f3914d;
        int i2 = c8898bo0.f17162d.f41848a.f11018c + i;
        String str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((C7605Fp1) oo0).f3435u;
        textView.setText(str);
        Context context = textView.getContext();
        textView.setContentDescription(AbstractC10554oh1.m23525f().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        C0197D7 c0197d7 = c8898bo0.f17165g;
        Calendar calendarM23525f = AbstractC10554oh1.m23525f();
        C4218i3 c4218i3 = (C4218i3) (calendarM23525f.get(1) == i2 ? c0197d7.f1852g : c0197d7.f1850e);
        Iterator it = c8898bo0.f17161c.m18154a().iterator();
        while (it.hasNext()) {
            calendarM23525f.setTimeInMillis(((Long) it.next()).longValue());
            if (calendarM23525f.get(1) == i2) {
                c4218i3 = (C4218i3) c0197d7.f1851f;
            }
        }
        c4218i3.m18958w(textView);
        textView.setOnClickListener(new ViewOnClickListenerC7553Ep1(this, i2));
    }

    @Override // p000.AbstractC10899rO0
    /* renamed from: d */
    public final OO0 mo3175d(ViewGroup viewGroup) {
        return new C7605Fp1((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}

package defpackage;

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
public final class C0535Gp1 extends AbstractC6830rO0 {
    public final C2394bo0 d;

    public C0535Gp1(C2394bo0 c2394bo0) {
        this.d = c2394bo0;
    }

    @Override // defpackage.AbstractC6830rO0
    public final int a() {
        return this.d.d.f;
    }

    @Override // defpackage.AbstractC6830rO0
    public final void c(OO0 oo0, int i) {
        C2394bo0 c2394bo0 = this.d;
        int i2 = c2394bo0.d.a.c + i;
        String str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((C0457Fp1) oo0).u;
        textView.setText(str);
        Context context = textView.getContext();
        textView.setContentDescription(AbstractC6316oh1.f().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        D7 d7 = c2394bo0.g;
        Calendar calendarF = AbstractC6316oh1.f();
        C4271i3 c4271i3 = (C4271i3) (calendarF.get(1) == i2 ? d7.g : d7.e);
        Iterator it = c2394bo0.c.a().iterator();
        while (it.hasNext()) {
            calendarF.setTimeInMillis(((Long) it.next()).longValue());
            if (calendarF.get(1) == i2) {
                c4271i3 = (C4271i3) d7.f;
            }
        }
        c4271i3.w(textView);
        textView.setOnClickListener(new ViewOnClickListenerC0379Ep1(this, i2));
    }

    @Override // defpackage.AbstractC6830rO0
    public final OO0 d(ViewGroup viewGroup) {
        return new C0457Fp1((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}

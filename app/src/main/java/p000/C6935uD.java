package p000;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import ru.mes.dnevnik.R;

/* renamed from: uD */
/* loaded from: classes.dex */
public final class C6935uD extends BaseAdapter {

    /* renamed from: d */
    public static final int f43590d;

    /* renamed from: a */
    public final Calendar f43591a;

    /* renamed from: b */
    public final int f43592b;

    /* renamed from: c */
    public final int f43593c;

    static {
        f43590d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C6935uD() {
        Calendar calendarM23526g = AbstractC10554oh1.m23526g(null);
        this.f43591a = calendarM23526g;
        this.f43592b = calendarM23526g.getMaximum(7);
        this.f43593c = calendarM23526g.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f43592b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.f43592b;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f43593c;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.f43593c;
        int i3 = this.f43592b;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.f43591a;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, f43590d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C6935uD(int i) {
        Calendar calendarM23526g = AbstractC10554oh1.m23526g(null);
        this.f43591a = calendarM23526g;
        this.f43592b = calendarM23526g.getMaximum(7);
        this.f43593c = i;
    }
}

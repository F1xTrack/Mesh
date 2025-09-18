package p000;

import android.os.Build;
import android.text.format.DateUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.C1943d;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: ao0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8770ao0 extends CO0 {

    /* renamed from: a */
    public final /* synthetic */ C1943d f16603a;

    /* renamed from: b */
    public final /* synthetic */ MaterialButton f16604b;

    /* renamed from: c */
    public final /* synthetic */ C8898bo0 f16605c;

    public C8770ao0(C8898bo0 c8898bo0, C1943d c1943d, MaterialButton materialButton) {
        this.f16605c = c8898bo0;
        this.f16603a = c1943d;
        this.f16604b = materialButton;
    }

    @Override // p000.CO0
    /* renamed from: a */
    public final void mo468a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f16604b.getText());
        }
    }

    @Override // p000.CO0
    /* renamed from: b */
    public final void mo469b(RecyclerView recyclerView, int i, int i2) {
        C8898bo0 c8898bo0 = this.f16605c;
        int iM10194N0 = i < 0 ? ((LinearLayoutManager) c8898bo0.f17167i.getLayoutManager()).m10194N0() : ((LinearLayoutManager) c8898bo0.f17167i.getLayoutManager()).m10195O0();
        C6763rl c6763rl = this.f16603a.f18210d;
        Calendar calendarM23523d = AbstractC10554oh1.m23523d(c6763rl.f41848a.f11016a);
        calendarM23523d.add(2, iM10194N0);
        c8898bo0.f17163e = new C8286Ss0(calendarM23523d);
        Calendar calendarM23523d2 = AbstractC10554oh1.m23523d(c6763rl.f41848a.f11016a);
        calendarM23523d2.add(2, iM10194N0);
        calendarM23523d2.set(5, 1);
        Calendar calendarM23523d3 = AbstractC10554oh1.m23523d(calendarM23523d2);
        calendarM23523d3.get(2);
        calendarM23523d3.get(1);
        calendarM23523d3.getMaximum(7);
        calendarM23523d3.getActualMaximum(5);
        calendarM23523d3.getTimeInMillis();
        long timeInMillis = calendarM23523d3.getTimeInMillis();
        this.f16604b.setText(Build.VERSION.SDK_INT >= 24 ? AbstractC10554oh1.m23522c("yMMMM", Locale.getDefault()).format(new Date(timeInMillis)) : DateUtils.formatDateTime(null, timeInMillis, 8228));
    }
}

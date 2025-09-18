package defpackage;

import android.os.Build;
import android.text.format.DateUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.d;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: ao0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2203ao0 extends CO0 {
    public final /* synthetic */ d a;
    public final /* synthetic */ MaterialButton b;
    public final /* synthetic */ C2394bo0 c;

    public C2203ao0(C2394bo0 c2394bo0, d dVar, MaterialButton materialButton) {
        this.c = c2394bo0;
        this.a = dVar;
        this.b = materialButton;
    }

    @Override // defpackage.CO0
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.b.getText());
        }
    }

    @Override // defpackage.CO0
    public final void b(RecyclerView recyclerView, int i, int i2) {
        C2394bo0 c2394bo0 = this.c;
        int iN0 = i < 0 ? ((LinearLayoutManager) c2394bo0.i.getLayoutManager()).N0() : ((LinearLayoutManager) c2394bo0.i.getLayoutManager()).O0();
        C6898rl c6898rl = this.a.d;
        Calendar calendarD = AbstractC6316oh1.d(c6898rl.a.a);
        calendarD.add(2, iN0);
        c2394bo0.e = new C1478Ss0(calendarD);
        Calendar calendarD2 = AbstractC6316oh1.d(c6898rl.a.a);
        calendarD2.add(2, iN0);
        calendarD2.set(5, 1);
        Calendar calendarD3 = AbstractC6316oh1.d(calendarD2);
        calendarD3.get(2);
        calendarD3.get(1);
        calendarD3.getMaximum(7);
        calendarD3.getActualMaximum(5);
        calendarD3.getTimeInMillis();
        long timeInMillis = calendarD3.getTimeInMillis();
        this.b.setText(Build.VERSION.SDK_INT >= 24 ? AbstractC6316oh1.c("yMMMM", Locale.getDefault()).format(new Date(timeInMillis)) : DateUtils.formatDateTime(null, timeInMillis, 8228));
    }
}

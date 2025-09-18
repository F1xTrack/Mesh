package p000;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.C1940a;
import com.google.android.material.datepicker.C1943d;

/* renamed from: bo0 */
/* loaded from: classes.dex */
public final class C8898bo0<S> extends AbstractC8820bB0 {

    /* renamed from: b */
    public int f17160b;

    /* renamed from: c */
    public C9315f11 f17161c;

    /* renamed from: d */
    public C6763rl f17162d;

    /* renamed from: e */
    public C8286Ss0 f17163e;

    /* renamed from: f */
    public int f17164f;

    /* renamed from: g */
    public C0197D7 f17165g;

    /* renamed from: h */
    public RecyclerView f17166h;

    /* renamed from: i */
    public RecyclerView f17167i;

    /* renamed from: j */
    public View f17168j;

    /* renamed from: k */
    public View f17169k;

    /* renamed from: l */
    public View f17170l;

    /* renamed from: m */
    public View f17171m;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f17160b = bundle.getInt("THEME_RES_ID_KEY");
        this.f17161c = (C9315f11) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f17162d = (C6763rl) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f17163e = (C8286Ss0) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f17160b);
        this.f17165g = new C0197D7(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C8286Ss0 c8286Ss0 = this.f17162d.f41848a;
        if (C9927jo0.m22103v(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = ru.mes.dnevnik.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = ru.mes.dnevnik.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(ru.mes.dnevnik.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(ru.mes.dnevnik.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(ru.mes.dnevnik.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(ru.mes.dnevnik.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = C1940a.f18199f;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(ru.mes.dnevnik.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(ru.mes.dnevnik.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(ru.mes.dnevnik.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(ru.mes.dnevnik.R.id.mtrl_calendar_days_of_week);
        AbstractC10944rk1.m24482n(gridView, new C7258zL(1));
        int i4 = this.f17162d.f41852e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new C6935uD(i4) : new C6935uD()));
        gridView.setNumColumns(c8286Ss0.f11019d);
        gridView.setEnabled(false);
        this.f17167i = (RecyclerView) viewInflate.findViewById(ru.mes.dnevnik.R.id.mtrl_calendar_months);
        getContext();
        this.f17167i.setLayoutManager(new C8588Yn0(this, i2, i2));
        this.f17167i.setTag("MONTHS_VIEW_GROUP_TAG");
        C1943d c1943d = new C1943d(contextThemeWrapper, this.f17161c, this.f17162d, new C9196e41(22, this));
        this.f17167i.setAdapter(c1943d);
        int integer = contextThemeWrapper.getResources().getInteger(ru.mes.dnevnik.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(ru.mes.dnevnik.R.id.mtrl_calendar_year_selector_frame);
        this.f17166h = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f17166h.setLayoutManager(new GridLayoutManager(integer));
            this.f17166h.setAdapter(new C7657Gp1(this));
            this.f17166h.m10268i(new C8640Zn0(this));
        }
        if (viewInflate.findViewById(ru.mes.dnevnik.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(ru.mes.dnevnik.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            AbstractC10944rk1.m24482n(materialButton, new C10895rM0(3, this));
            View viewFindViewById = viewInflate.findViewById(ru.mes.dnevnik.R.id.month_navigation_previous);
            this.f17168j = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(ru.mes.dnevnik.R.id.month_navigation_next);
            this.f17169k = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f17170l = viewInflate.findViewById(ru.mes.dnevnik.R.id.mtrl_calendar_year_selector_frame);
            this.f17171m = viewInflate.findViewById(ru.mes.dnevnik.R.id.mtrl_calendar_day_selector_frame);
            m10523t(1);
            materialButton.setText(this.f17163e.m7459d());
            this.f17167i.m10270j(new C8770ao0(this, c1943d, materialButton));
            materialButton.setOnClickListener(new ViewOnClickListenerC1822c2(2, this));
            this.f17169k.setOnClickListener(new ViewOnClickListenerC8536Xn0(this, c1943d, 1));
            this.f17168j.setOnClickListener(new ViewOnClickListenerC8536Xn0(this, c1943d, 0));
        }
        if (!C9927jo0.m22103v(contextThemeWrapper, R.attr.windowFullscreen)) {
            new C8248Rz0().m7138a(this.f17167i);
        }
        this.f17167i.m10265g0(c1943d.f18210d.f41848a.m7460e(this.f17163e));
        AbstractC10944rk1.m24482n(this.f17167i, new C7258zL(2));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f17160b);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f17161c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f17162d);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f17163e);
    }

    @Override // p000.AbstractC8820bB0
    /* renamed from: r */
    public final void mo10432r(C9799io0 c9799io0) {
        this.f16856a.add(c9799io0);
    }

    /* renamed from: s */
    public final void m10522s(C8286Ss0 c8286Ss0) {
        C1943d c1943d = (C1943d) this.f17167i.getAdapter();
        int iM7460e = c1943d.f18210d.f41848a.m7460e(c8286Ss0);
        int iM7460e2 = iM7460e - c1943d.f18210d.f41848a.m7460e(this.f17163e);
        boolean z = Math.abs(iM7460e2) > 3;
        boolean z2 = iM7460e2 > 0;
        this.f17163e = c8286Ss0;
        if (z && z2) {
            this.f17167i.m10265g0(iM7460e - 3);
            this.f17167i.post(new RunnableC0552Il(this, iM7460e, 2));
        } else if (!z) {
            this.f17167i.post(new RunnableC0552Il(this, iM7460e, 2));
        } else {
            this.f17167i.m10265g0(iM7460e + 3);
            this.f17167i.post(new RunnableC0552Il(this, iM7460e, 2));
        }
    }

    /* renamed from: t */
    public final void m10523t(int i) {
        this.f17164f = i;
        if (i == 2) {
            this.f17166h.getLayoutManager().mo10223q0(this.f17163e.f11018c - ((C7657Gp1) this.f17166h.getAdapter()).f3914d.f17162d.f41848a.f11018c);
            this.f17170l.setVisibility(0);
            this.f17171m.setVisibility(8);
            this.f17168j.setVisibility(8);
            this.f17169k.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f17170l.setVisibility(8);
            this.f17171m.setVisibility(0);
            this.f17168j.setVisibility(0);
            this.f17169k.setVisibility(0);
            m10522s(this.f17163e);
        }
    }
}

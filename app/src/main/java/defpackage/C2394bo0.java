package defpackage;

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
import com.google.android.material.datepicker.a;
import com.google.android.material.datepicker.d;

/* renamed from: bo0 */
/* loaded from: classes.dex */
public final class C2394bo0<S> extends AbstractC2277bB0 {
    public int b;
    public C3692f11 c;
    public C6898rl d;
    public C1478Ss0 e;
    public int f;
    public D7 g;
    public RecyclerView h;
    public RecyclerView i;
    public View j;
    public View k;
    public View l;
    public View m;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.b = bundle.getInt("THEME_RES_ID_KEY");
        this.c = (C3692f11) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.d = (C6898rl) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.e = (C1478Ss0) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.b);
        this.g = new D7(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C1478Ss0 c1478Ss0 = this.d.a;
        if (C5381jo0.v(contextThemeWrapper, R.attr.windowFullscreen)) {
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
        int i3 = a.f;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(ru.mes.dnevnik.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(ru.mes.dnevnik.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(ru.mes.dnevnik.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(ru.mes.dnevnik.R.id.mtrl_calendar_days_of_week);
        AbstractC6897rk1.n(gridView, new C8344zL(1));
        int i4 = this.d.e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new C7369uD(i4) : new C7369uD()));
        gridView.setNumColumns(c1478Ss0.d);
        gridView.setEnabled(false);
        this.i = (RecyclerView) viewInflate.findViewById(ru.mes.dnevnik.R.id.mtrl_calendar_months);
        getContext();
        this.i.setLayoutManager(new C1931Yn0(this, i2, i2));
        this.i.setTag("MONTHS_VIEW_GROUP_TAG");
        d dVar = new d(contextThemeWrapper, this.c, this.d, new C3513e41(22, this));
        this.i.setAdapter(dVar);
        int integer = contextThemeWrapper.getResources().getInteger(ru.mes.dnevnik.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(ru.mes.dnevnik.R.id.mtrl_calendar_year_selector_frame);
        this.h = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.h.setLayoutManager(new GridLayoutManager(integer));
            this.h.setAdapter(new C0535Gp1(this));
            this.h.i(new C2009Zn0(this));
        }
        if (viewInflate.findViewById(ru.mes.dnevnik.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(ru.mes.dnevnik.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            AbstractC6897rk1.n(materialButton, new C6824rM0(3, this));
            View viewFindViewById = viewInflate.findViewById(ru.mes.dnevnik.R.id.month_navigation_previous);
            this.j = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(ru.mes.dnevnik.R.id.month_navigation_next);
            this.k = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.l = viewInflate.findViewById(ru.mes.dnevnik.R.id.mtrl_calendar_year_selector_frame);
            this.m = viewInflate.findViewById(ru.mes.dnevnik.R.id.mtrl_calendar_day_selector_frame);
            t(1);
            materialButton.setText(this.e.d());
            this.i.j(new C2203ao0(this, dVar, materialButton));
            materialButton.setOnClickListener(new ViewOnClickListenerC2437c2(2, this));
            this.k.setOnClickListener(new ViewOnClickListenerC1853Xn0(this, dVar, 1));
            this.j.setOnClickListener(new ViewOnClickListenerC1853Xn0(this, dVar, 0));
        }
        if (!C5381jo0.v(contextThemeWrapper, R.attr.windowFullscreen)) {
            new C1421Rz0().a(this.i);
        }
        this.i.g0(dVar.d.a.e(this.e));
        AbstractC6897rk1.n(this.i, new C8344zL(2));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.b);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.d);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.e);
    }

    @Override // defpackage.AbstractC2277bB0
    public final void r(C5191io0 c5191io0) {
        this.a.add(c5191io0);
    }

    public final void s(C1478Ss0 c1478Ss0) {
        d dVar = (d) this.i.getAdapter();
        int iE = dVar.d.a.e(c1478Ss0);
        int iE2 = iE - dVar.d.a.e(this.e);
        boolean z = Math.abs(iE2) > 3;
        boolean z2 = iE2 > 0;
        this.e = c1478Ss0;
        if (z && z2) {
            this.i.g0(iE - 3);
            this.i.post(new RunnableC0677Il(this, iE, 2));
        } else if (!z) {
            this.i.post(new RunnableC0677Il(this, iE, 2));
        } else {
            this.i.g0(iE + 3);
            this.i.post(new RunnableC0677Il(this, iE, 2));
        }
    }

    public final void t(int i) {
        this.f = i;
        if (i == 2) {
            this.h.getLayoutManager().q0(this.e.c - ((C0535Gp1) this.h.getAdapter()).d.d.a.c);
            this.l.setVisibility(0);
            this.m.setVisibility(8);
            this.j.setVisibility(8);
            this.k.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.l.setVisibility(8);
            this.m.setVisibility(0);
            this.j.setVisibility(0);
            this.k.setVisibility(0);
            s(this.e);
        }
    }
}

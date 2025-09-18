package androidx.media3.p002ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p000.C8149Qb1;
import p000.C8461Wb1;
import p000.C8747ac1;
import p000.C9136dc1;
import p000.C9196e41;
import p000.InterfaceC8253Sb1;
import p000.ViewOnClickListenerC1822c2;

/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: a */
    public final int f16415a;

    /* renamed from: b */
    public final LayoutInflater f16416b;

    /* renamed from: c */
    public final CheckedTextView f16417c;

    /* renamed from: d */
    public final CheckedTextView f16418d;

    /* renamed from: e */
    public final ViewOnClickListenerC1822c2 f16419e;

    /* renamed from: f */
    public final ArrayList f16420f;

    /* renamed from: g */
    public final HashMap f16421g;

    /* renamed from: h */
    public boolean f16422h;

    /* renamed from: i */
    public boolean f16423i;

    /* renamed from: j */
    public InterfaceC8253Sb1 f16424j;

    /* renamed from: k */
    public CheckedTextView[][] f16425k;

    /* renamed from: l */
    public boolean f16426l;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f16415a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f16416b = layoutInflaterFrom;
        ViewOnClickListenerC1822c2 viewOnClickListenerC1822c2 = new ViewOnClickListenerC1822c2(7, this);
        this.f16419e = viewOnClickListenerC1822c2;
        this.f16424j = new C9196e41(getResources());
        this.f16420f = new ArrayList();
        this.f16421g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f16417c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(ru.mes.dnevnik.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(viewOnClickListenerC1822c2);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(ru.mes.dnevnik.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f16418d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(ru.mes.dnevnik.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(viewOnClickListenerC1822c2);
        addView(checkedTextView2);
    }

    /* renamed from: a */
    public final void m10145a() {
        this.f16417c.setChecked(this.f16426l);
        boolean z = this.f16426l;
        HashMap map = this.f16421g;
        this.f16418d.setChecked(!z && map.size() == 0);
        for (int i = 0; i < this.f16425k.length; i++) {
            C8461Wb1 c8461Wb1 = (C8461Wb1) map.get(((C9136dc1) this.f16420f.get(i)).f26162b);
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f16425k[i];
                if (i2 < checkedTextViewArr.length) {
                    if (c8461Wb1 != null) {
                        Object tag = checkedTextViewArr[i2].getTag();
                        tag.getClass();
                        this.f16425k[i][i2].setChecked(c8461Wb1.f13277b.contains(Integer.valueOf(((C8747ac1) tag).f15588b)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10146b() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.p002ui.TrackSelectionView.m10146b():void");
    }

    public boolean getIsDisabled() {
        return this.f16426l;
    }

    public Map<C8149Qb1, C8461Wb1> getOverrides() {
        return this.f16421g;
    }

    public void setAllowAdaptiveSelections(boolean z) throws Resources.NotFoundException {
        if (this.f16422h != z) {
            this.f16422h = z;
            m10146b();
        }
    }

    public void setAllowMultipleOverrides(boolean z) throws Resources.NotFoundException {
        if (this.f16423i != z) {
            this.f16423i = z;
            if (!z) {
                HashMap map = this.f16421g;
                if (map.size() > 1) {
                    ArrayList arrayList = this.f16420f;
                    HashMap map2 = new HashMap();
                    for (int i = 0; i < arrayList.size(); i++) {
                        C8461Wb1 c8461Wb1 = (C8461Wb1) map.get(((C9136dc1) arrayList.get(i)).f26162b);
                        if (c8461Wb1 != null && map2.isEmpty()) {
                            map2.put(c8461Wb1.f13276a, c8461Wb1);
                        }
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            m10146b();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.f16417c.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(InterfaceC8253Sb1 interfaceC8253Sb1) throws Resources.NotFoundException {
        interfaceC8253Sb1.getClass();
        this.f16424j = interfaceC8253Sb1;
        m10146b();
    }
}

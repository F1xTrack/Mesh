package p000;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import com.huawei.hms.actions.SearchIntents;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* renamed from: jX0 */
/* loaded from: classes.dex */
public abstract class AbstractC9893jX0 extends AbstractC8474Wi0 implements InterfaceC6772ru {

    /* renamed from: u1 */
    public static final C10910rT1 f35175u1;

    /* renamed from: A */
    public final Rect f35176A;

    /* renamed from: B */
    public final int[] f35177B;

    /* renamed from: C */
    public final int[] f35178C;

    /* renamed from: D */
    public final ImageView f35179D;

    /* renamed from: E */
    public final Drawable f35180E;

    /* renamed from: F */
    public final int f35181F;

    /* renamed from: G */
    public final int f35182G;

    /* renamed from: H */
    public final Intent f35183H;

    /* renamed from: I */
    public final Intent f35184I;

    /* renamed from: J */
    public final CharSequence f35185J;

    /* renamed from: K */
    public InterfaceC9381fX0 f35186K;

    /* renamed from: L */
    public InterfaceC9253eX0 f35187L;

    /* renamed from: M */
    public View.OnFocusChangeListener f35188M;

    /* renamed from: N */
    public View.OnClickListener f35189N;

    /* renamed from: O */
    public boolean f35190O;

    /* renamed from: P */
    public boolean f35191P;

    /* renamed from: Q */
    public AbstractC0075BB f35192Q;

    /* renamed from: R */
    public boolean f35193R;

    /* renamed from: S */
    public CharSequence f35194S;

    /* renamed from: T */
    public boolean f35195T;

    /* renamed from: U */
    public boolean f35196U;

    /* renamed from: V */
    public int f35197V;

    /* renamed from: W */
    public boolean f35198W;

    /* renamed from: a0 */
    public String f35199a0;

    /* renamed from: b0 */
    public CharSequence f35200b0;

    /* renamed from: c0 */
    public boolean f35201c0;

    /* renamed from: d0 */
    public int f35202d0;

    /* renamed from: e0 */
    public SearchableInfo f35203e0;

    /* renamed from: p */
    public final SearchView$SearchAutoComplete f35204p;

    /* renamed from: q */
    public final View f35205q;

    /* renamed from: q1 */
    public Bundle f35206q1;

    /* renamed from: r */
    public final View f35207r;

    /* renamed from: r1 */
    public final ZW0 f35208r1;

    /* renamed from: s */
    public final View f35209s;

    /* renamed from: s1 */
    public final ZW0 f35210s1;

    /* renamed from: t */
    public final ImageView f35211t;

    /* renamed from: t1 */
    public final WeakHashMap f35212t1;

    /* renamed from: u */
    public final ImageView f35213u;

    /* renamed from: v */
    public final ImageView f35214v;

    /* renamed from: w */
    public final ImageView f35215w;

    /* renamed from: x */
    public final View f35216x;

    /* renamed from: y */
    public C9765iX0 f35217y;

    /* renamed from: z */
    public final Rect f35218z;

    static {
        C10910rT1 c10910rT1 = null;
        if (Build.VERSION.SDK_INT < 29) {
            C10910rT1 c10910rT12 = new C10910rT1(23, false);
            c10910rT12.f41678b = null;
            c10910rT12.f41679c = null;
            c10910rT12.f41680d = null;
            C10910rT1.m24363E();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                c10910rT12.f41678b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                c10910rT12.f41679c = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                c10910rT12.f41680d = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            c10910rT1 = c10910rT12;
        }
        f35175u1 = c10910rT1;
    }

    public AbstractC9893jX0(Context context) {
        super(context, null, R.attr.searchViewStyle);
        this.f35218z = new Rect();
        this.f35176A = new Rect();
        this.f35177B = new int[2];
        this.f35178C = new int[2];
        C0830NB c0830nb = (C0830NB) this;
        this.f35208r1 = new ZW0(c0830nb, 0);
        this.f35210s1 = new ZW0(c0830nb, 1);
        this.f35212t1 = new WeakHashMap();
        ViewOnClickListenerC1822c2 viewOnClickListenerC1822c2 = new ViewOnClickListenerC1822c2(4, c0830nb);
        ViewOnKeyListenerC8864bX0 viewOnKeyListenerC8864bX0 = new ViewOnKeyListenerC8864bX0(c0830nb);
        C8992cX0 c8992cX0 = new C8992cX0(c0830nb);
        C1765b7 c1765b7 = new C1765b7(2, c0830nb);
        C7384Bj0 c7384Bj0 = new C7384Bj0(1, c0830nb);
        YW0 yw0 = new YW0(c0830nb);
        int[] iArr = AbstractC8704aH0.f15443u;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.searchViewStyle, 0);
        C8539Xo1 c8539Xo1 = new C8539Xo1(context, typedArrayObtainStyledAttributes);
        AbstractC10944rk1.m24481m(this, context, iArr, null, typedArrayObtainStyledAttributes, R.attr.searchViewStyle, 0);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f35204p = searchView$SearchAutoComplete;
        searchView$SearchAutoComplete.setSearchView(this);
        this.f35205q = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f35207r = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f35209s = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f35211t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f35213u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f35214v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f35215w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f35179D = imageView5;
        viewFindViewById.setBackground(c8539Xo1.m9121C(20));
        viewFindViewById2.setBackground(c8539Xo1.m9121C(25));
        imageView.setImageDrawable(c8539Xo1.m9121C(23));
        imageView2.setImageDrawable(c8539Xo1.m9121C(15));
        imageView3.setImageDrawable(c8539Xo1.m9121C(12));
        imageView4.setImageDrawable(c8539Xo1.m9121C(28));
        imageView5.setImageDrawable(c8539Xo1.m9121C(23));
        this.f35180E = c8539Xo1.m9121C(22);
        KY1.m4672b(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f35181F = typedArrayObtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.f35182G = typedArrayObtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(viewOnClickListenerC1822c2);
        imageView3.setOnClickListener(viewOnClickListenerC1822c2);
        imageView2.setOnClickListener(viewOnClickListenerC1822c2);
        imageView4.setOnClickListener(viewOnClickListenerC1822c2);
        searchView$SearchAutoComplete.setOnClickListener(viewOnClickListenerC1822c2);
        searchView$SearchAutoComplete.addTextChangedListener(yw0);
        searchView$SearchAutoComplete.setOnEditorActionListener(c8992cX0);
        searchView$SearchAutoComplete.setOnItemClickListener(c1765b7);
        searchView$SearchAutoComplete.setOnItemSelectedListener(c7384Bj0);
        searchView$SearchAutoComplete.setOnKeyListener(viewOnKeyListenerC8864bX0);
        searchView$SearchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC8736aX0(c0830nb));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f35185J = typedArrayObtainStyledAttributes.getText(14);
        this.f35194S = typedArrayObtainStyledAttributes.getText(21);
        int i = typedArrayObtainStyledAttributes.getInt(6, -1);
        if (i != -1) {
            setImeOptions(i);
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(5, -1);
        if (i2 != -1) {
            setInputType(i2);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(1, true));
        c8539Xo1.m9130M();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f35183H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f35184I = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchView$SearchAutoComplete.getDropDownAnchor());
        this.f35216x = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0800Mi(1, c0830nb));
        }
        m22068z(this.f35190O);
        m22065w();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f35204p;
        searchView$SearchAutoComplete.setText(charSequence);
        searchView$SearchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f35196U = true;
        super.clearFocus();
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f35204p;
        searchView$SearchAutoComplete.clearFocus();
        searchView$SearchAutoComplete.setImeVisibility(false);
        this.f35196U = false;
    }

    @Override // p000.InterfaceC6772ru
    /* renamed from: d */
    public final void mo5460d() {
        if (this.f35201c0) {
            return;
        }
        this.f35201c0 = true;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f35204p;
        int imeOptions = searchView$SearchAutoComplete.getImeOptions();
        this.f35202d0 = imeOptions;
        searchView$SearchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchView$SearchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // p000.InterfaceC6772ru
    /* renamed from: e */
    public final void mo5461e() {
        m22062t("");
        clearFocus();
        m22068z(true);
        this.f35204p.setImeOptions(this.f35202d0);
        this.f35201c0 = false;
    }

    public int getImeOptions() {
        return this.f35204p.getImeOptions();
    }

    public int getInputType() {
        return this.f35204p.getInputType();
    }

    public int getMaxWidth() {
        return this.f35197V;
    }

    public CharSequence getQuery() {
        return this.f35204p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f35194S;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f35203e0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f35185J : getContext().getText(this.f35203e0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f35182G;
    }

    public int getSuggestionRowLayout() {
        return this.f35181F;
    }

    public AbstractC0075BB getSuggestionsAdapter() {
        return this.f35192Q;
    }

    /* renamed from: l */
    public final Intent m22054l(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f35200b0);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f35206q1;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f35203e0.getSearchActivity());
        return intent;
    }

    /* renamed from: m */
    public final Intent m22055m(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f35206q1;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: n */
    public final void m22056n() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = Build.VERSION.SDK_INT;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f35204p;
        if (i >= 29) {
            AbstractC9125dX0.m17703a(searchView$SearchAutoComplete);
            return;
        }
        C10910rT1 c10910rT1 = f35175u1;
        c10910rT1.getClass();
        C10910rT1.m24363E();
        Method method = (Method) c10910rT1.f41678b;
        if (method != null) {
            try {
                method.invoke(searchView$SearchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        c10910rT1.getClass();
        C10910rT1.m24363E();
        Method method2 = (Method) c10910rT1.f41679c;
        if (method2 != null) {
            try {
                method2.invoke(searchView$SearchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: o */
    public final void m22057o() {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f35204p;
        if (!TextUtils.isEmpty(searchView$SearchAutoComplete.getText())) {
            searchView$SearchAutoComplete.setText("");
            searchView$SearchAutoComplete.requestFocus();
            searchView$SearchAutoComplete.setImeVisibility(true);
        } else if (this.f35190O) {
            InterfaceC9253eX0 interfaceC9253eX0 = this.f35187L;
            if (interfaceC9253eX0 == null || !interfaceC9253eX0.mo501f()) {
                clearFocus();
                m22068z(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f35208r1);
        post(this.f35210s1);
        super.onDetachedFromWindow();
    }

    @Override // p000.AbstractC8474Wi0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int[] iArr = this.f35177B;
            SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f35204p;
            searchView$SearchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f35178C;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchView$SearchAutoComplete.getWidth() + i6;
            int height = searchView$SearchAutoComplete.getHeight() + i5;
            Rect rect = this.f35218z;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.f35176A;
            rect2.set(i7, 0, i8, i9);
            C9765iX0 c9765iX0 = this.f35217y;
            if (c9765iX0 == null) {
                C9765iX0 c9765iX02 = new C9765iX0(searchView$SearchAutoComplete, rect2, rect);
                this.f35217y = c9765iX02;
                setTouchDelegate(c9765iX02);
            } else {
                c9765iX0.f29305b.set(rect2);
                Rect rect3 = c9765iX0.f29307d;
                rect3.set(rect2);
                int i10 = -c9765iX0.f29308e;
                rect3.inset(i10, i10);
                c9765iX0.f29306c.set(rect);
            }
        }
    }

    @Override // p000.AbstractC8474Wi0, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f35191P) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f35197V;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f35197V;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.f35197V) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C9637hX0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C9637hX0 c9637hX0 = (C9637hX0) parcelable;
        super.onRestoreInstanceState(c9637hX0.f44064a);
        m22068z(c9637hX0.f28445c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C9637hX0 c9637hX0 = new C9637hX0(super.onSaveInstanceState());
        c9637hX0.f28445c = this.f35191P;
        return c9637hX0;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f35208r1);
    }

    /* renamed from: p */
    public final void m22058p(int i) {
        String strM22670h;
        Cursor cursor = this.f35192Q.f617c;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentM22054l = null;
            try {
                try {
                    int i2 = ViewOnClickListenerC10224m61.f37472x;
                    String strM22670h2 = ViewOnClickListenerC10224m61.m22670h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (strM22670h2 == null) {
                        strM22670h2 = this.f35203e0.getSuggestIntentAction();
                    }
                    if (strM22670h2 == null) {
                        strM22670h2 = "android.intent.action.SEARCH";
                    }
                    String strM22670h3 = ViewOnClickListenerC10224m61.m22670h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (strM22670h3 == null) {
                        strM22670h3 = this.f35203e0.getSuggestIntentData();
                    }
                    if (strM22670h3 != null && (strM22670h = ViewOnClickListenerC10224m61.m22670h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        strM22670h3 = strM22670h3 + "/" + Uri.encode(strM22670h);
                    }
                    intentM22054l = m22054l(strM22670h2, strM22670h3 == null ? null : Uri.parse(strM22670h3), ViewOnClickListenerC10224m61.m22670h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), ViewOnClickListenerC10224m61.m22670h(cursor, cursor.getColumnIndex("suggest_intent_query")));
                } catch (RuntimeException unused) {
                    cursor.getPosition();
                }
            } catch (RuntimeException unused2) {
            }
            if (intentM22054l != null) {
                try {
                    getContext().startActivity(intentM22054l);
                } catch (RuntimeException unused3) {
                    intentM22054l.toString();
                }
            }
        }
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f35204p;
        searchView$SearchAutoComplete.setImeVisibility(false);
        searchView$SearchAutoComplete.dismissDropDown();
    }

    /* renamed from: q */
    public final void m22059q(int i) {
        Editable text = this.f35204p.getText();
        Cursor cursor = this.f35192Q.f617c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        String strMo542c = this.f35192Q.mo542c(cursor);
        if (strMo542c != null) {
            setQuery(strMo542c);
        } else {
            setQuery(text);
        }
    }

    /* renamed from: r */
    public final void m22060r(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.f35196U || !isFocusable()) {
            return false;
        }
        if (this.f35191P) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.f35204p.requestFocus(i, rect);
        if (zRequestFocus) {
            m22068z(false);
        }
        return zRequestFocus;
    }

    /* renamed from: s */
    public final void m22061s() {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f35204p;
        Editable text = searchView$SearchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        InterfaceC9381fX0 interfaceC9381fX0 = this.f35186K;
        if (interfaceC9381fX0 != null) {
            String string = text.toString();
            XW0 xw0 = (XW0) ((GQ0) interfaceC9381fX0).f3735b;
            xw0.m9068s(new C0977PW(xw0.f13827m, xw0.getId(), 6, string));
        } else {
            if (this.f35203e0 != null) {
                getContext().startActivity(m22054l("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchView$SearchAutoComplete.setImeVisibility(false);
            searchView$SearchAutoComplete.dismissDropDown();
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.f35206q1 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m22057o();
            return;
        }
        m22068z(false);
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f35204p;
        searchView$SearchAutoComplete.requestFocus();
        searchView$SearchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f35189N;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f35190O == z) {
            return;
        }
        this.f35190O = z;
        m22068z(z);
        m22065w();
    }

    public void setImeOptions(int i) {
        this.f35204p.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f35204p.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f35197V = i;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC9253eX0 interfaceC9253eX0) {
        this.f35187L = interfaceC9253eX0;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f35188M = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC9381fX0 interfaceC9381fX0) {
        this.f35186K = interfaceC9381fX0;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f35189N = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f35194S = charSequence;
        m22065w();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f35195T = z;
        AbstractC0075BB abstractC0075BB = this.f35192Q;
        if (abstractC0075BB instanceof ViewOnClickListenerC10224m61) {
            ((ViewOnClickListenerC10224m61) abstractC0075BB).f37481p = z ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f35203e0 = searchableInfo;
        Intent intent = null;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f35204p;
        if (searchableInfo != null) {
            searchView$SearchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchView$SearchAutoComplete.setImeOptions(this.f35203e0.getImeOptions());
            int inputType = this.f35203e0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f35203e0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchView$SearchAutoComplete.setInputType(inputType);
            AbstractC0075BB abstractC0075BB = this.f35192Q;
            if (abstractC0075BB != null) {
                abstractC0075BB.mo541b(null);
            }
            if (this.f35203e0.getSuggestAuthority() != null) {
                ViewOnClickListenerC10224m61 viewOnClickListenerC10224m61 = new ViewOnClickListenerC10224m61(getContext(), this, this.f35203e0, this.f35212t1);
                this.f35192Q = viewOnClickListenerC10224m61;
                searchView$SearchAutoComplete.setAdapter(viewOnClickListenerC10224m61);
                ((ViewOnClickListenerC10224m61) this.f35192Q).f37481p = this.f35195T ? 2 : 1;
            }
            m22065w();
        }
        SearchableInfo searchableInfo2 = this.f35203e0;
        boolean z = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f35203e0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f35183H;
            } else if (this.f35203e0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f35184I;
            }
            if (intent != null) {
                z = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.f35198W = z;
        if (z) {
            searchView$SearchAutoComplete.setPrivateImeOptions("nm");
        }
        m22068z(this.f35191P);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f35193R = z;
        m22068z(this.f35191P);
    }

    public void setSuggestionsAdapter(AbstractC0075BB abstractC0075BB) {
        this.f35192Q = abstractC0075BB;
        this.f35204p.setAdapter(abstractC0075BB);
    }

    /* renamed from: t */
    public final void m22062t(String str) {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f35204p;
        searchView$SearchAutoComplete.setText(str);
        if (str != null) {
            searchView$SearchAutoComplete.setSelection(searchView$SearchAutoComplete.length());
            this.f35200b0 = str;
        }
    }

    /* renamed from: u */
    public final void m22063u() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f35204p.getText());
        int i = (!zIsEmpty || (this.f35190O && !this.f35201c0)) ? 0 : 8;
        ImageView imageView = this.f35214v;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: v */
    public final void m22064v() {
        int[] iArr = this.f35204p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f35207r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f35209s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* renamed from: w */
    public final void m22065w() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z = this.f35190O;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f35204p;
        if (z && (drawable = this.f35180E) != null) {
            int textSize = (int) (searchView$SearchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchView$SearchAutoComplete.setHint(queryHint);
    }

    /* renamed from: x */
    public final void m22066x() {
        this.f35209s.setVisibility(((this.f35193R || this.f35198W) && !this.f35191P && (this.f35213u.getVisibility() == 0 || this.f35215w.getVisibility() == 0)) ? 0 : 8);
    }

    /* renamed from: y */
    public final void m22067y(boolean z) {
        boolean z2 = this.f35193R;
        this.f35213u.setVisibility((!z2 || !(z2 || this.f35198W) || this.f35191P || !hasFocus() || (!z && this.f35198W)) ? 8 : 0);
    }

    /* renamed from: z */
    public final void m22068z(boolean z) {
        this.f35191P = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f35204p.getText());
        this.f35211t.setVisibility(i2);
        m22067y(!zIsEmpty);
        this.f35205q.setVisibility(z ? 8 : 0);
        ImageView imageView = this.f35179D;
        imageView.setVisibility((imageView.getDrawable() == null || this.f35190O) ? 8 : 0);
        m22063u();
        if (this.f35198W && !this.f35191P && zIsEmpty) {
            this.f35213u.setVisibility(8);
            i = 0;
        }
        this.f35215w.setVisibility(i);
        m22066x();
    }

    public void setOnSuggestionListener(InterfaceC9509gX0 interfaceC9509gX0) {
    }
}

package com.yalantis.ucrop;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.yalantis.ucrop.task.BitmapCropTask;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import p000.AbstractActivityC4221i6;
import p000.AbstractC0628Jy;
import p000.AbstractC0691Ky;
import p000.AbstractC11452vi1;
import p000.AbstractC6928u6;
import p000.AbstractC7787Jc1;
import p000.AbstractC9366fP1;
import p000.AsyncTaskC4070fi;
import p000.C10339n11;
import p000.C10525oT0;
import p000.C1078R8;
import p000.C10909rT0;
import p000.C11249u70;
import p000.C6347lB;
import p000.C6563oc;
import p000.C6679qQ;
import p000.ExecutorC6865t6;
import p000.FM1;
import p000.GQ0;
import p000.L21;
import p000.TX0;
import p000.ViewOnClickListenerC8519Xe1;
import ru.mes.dnevnik.R;

/* loaded from: classes2.dex */
public class UCropActivity extends AbstractActivityC4221i6 {

    /* renamed from: K */
    public static final Bitmap.CompressFormat f20608K = Bitmap.CompressFormat.JPEG;

    /* renamed from: B */
    public TextView f20610B;

    /* renamed from: C */
    public TextView f20611C;

    /* renamed from: D */
    public View f20612D;

    /* renamed from: E */
    public C6563oc f20613E;

    /* renamed from: g */
    public String f20619g;

    /* renamed from: h */
    public int f20620h;

    /* renamed from: i */
    public int f20621i;

    /* renamed from: j */
    public int f20622j;

    /* renamed from: k */
    public int f20623k;

    /* renamed from: l */
    public int f20624l;

    /* renamed from: m */
    public int f20625m;

    /* renamed from: n */
    public int f20626n;

    /* renamed from: o */
    public int f20627o;

    /* renamed from: p */
    public boolean f20628p;

    /* renamed from: r */
    public UCropView f20630r;

    /* renamed from: s */
    public GestureCropImageView f20631s;

    /* renamed from: t */
    public OverlayView f20632t;

    /* renamed from: u */
    public ViewGroup f20633u;

    /* renamed from: v */
    public ViewGroup f20634v;

    /* renamed from: w */
    public ViewGroup f20635w;

    /* renamed from: x */
    public ViewGroup f20636x;

    /* renamed from: y */
    public ViewGroup f20637y;

    /* renamed from: z */
    public ViewGroup f20638z;

    /* renamed from: q */
    public boolean f20629q = true;

    /* renamed from: A */
    public final ArrayList f20609A = new ArrayList();

    /* renamed from: F */
    public Bitmap.CompressFormat f20614F = f20608K;

    /* renamed from: G */
    public int f20615G = 90;

    /* renamed from: H */
    public int[] f20616H = {1, 2, 3};

    /* renamed from: I */
    public final GQ0 f20617I = new GQ0(5, this);

    /* renamed from: J */
    public final ViewOnClickListenerC8519Xe1 f20618J = new ViewOnClickListenerC8519Xe1(this, 3);

    static {
        ExecutorC6865t6 executorC6865t6 = AbstractC6928u6.f43504a;
        int i = AbstractC11452vi1.f44502a;
    }

    /* renamed from: k */
    public final void m13759k(int i) {
        GestureCropImageView gestureCropImageView = this.f20631s;
        int i2 = this.f20616H[i];
        gestureCropImageView.setScaleEnabled(i2 == 3 || i2 == 1);
        GestureCropImageView gestureCropImageView2 = this.f20631s;
        int i3 = this.f20616H[i];
        gestureCropImageView2.setRotateEnabled(i3 == 3 || i3 == 2);
    }

    /* renamed from: l */
    public final void m13760l(Throwable th) {
        setResult(96, new Intent().putExtra("com.yalantis.ucrop.Error", th));
    }

    /* renamed from: m */
    public final void m13761m(int i) {
        if (this.f20628p) {
            this.f20633u.setSelected(i == R.id.state_aspect_ratio);
            this.f20634v.setSelected(i == R.id.state_rotate);
            this.f20635w.setSelected(i == R.id.state_scale);
            this.f20636x.setVisibility(i == R.id.state_aspect_ratio ? 0 : 8);
            this.f20637y.setVisibility(i == R.id.state_rotate ? 0 : 8);
            this.f20638z.setVisibility(i == R.id.state_scale ? 0 : 8);
            AbstractC7787Jc1.m4368a((ViewGroup) findViewById(R.id.ucrop_photobox), this.f20613E);
            this.f20635w.findViewById(R.id.text_view_scale).setVisibility(i == R.id.state_scale ? 0 : 8);
            this.f20633u.findViewById(R.id.text_view_crop).setVisibility(i == R.id.state_aspect_ratio ? 0 : 8);
            this.f20634v.findViewById(R.id.text_view_rotate).setVisibility(i == R.id.state_rotate ? 0 : 8);
            if (i == R.id.state_scale) {
                m13759k(0);
            } else if (i == R.id.state_rotate) {
                m13759k(1);
            } else {
                m13759k(2);
            }
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1730l, p000.AbstractActivityC0499Hv, p000.AbstractActivityC0436Gv, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList;
        super.onCreate(bundle);
        setContentView(R.layout.ucrop_activity_photobox);
        Intent intent = getIntent();
        this.f20621i = intent.getIntExtra("com.yalantis.ucrop.StatusBarColor", AbstractC0691Ky.m4783a(this, R.color.ucrop_color_statusbar));
        this.f20620h = intent.getIntExtra("com.yalantis.ucrop.ToolbarColor", AbstractC0691Ky.m4783a(this, R.color.ucrop_color_toolbar));
        this.f20622j = intent.getIntExtra("com.yalantis.ucrop.UcropColorControlsWidgetActive", AbstractC0691Ky.m4783a(this, R.color.ucrop_color_active_controls_color));
        this.f20623k = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarWidgetColor", AbstractC0691Ky.m4783a(this, R.color.ucrop_color_toolbar_widget));
        this.f20625m = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCancelDrawable", R.drawable.ucrop_ic_cross);
        this.f20626n = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCropDrawable", R.drawable.ucrop_ic_done);
        String stringExtra = intent.getStringExtra("com.yalantis.ucrop.UcropToolbarTitleText");
        this.f20619g = stringExtra;
        if (stringExtra == null) {
            stringExtra = getResources().getString(R.string.ucrop_label_edit_photo);
        }
        this.f20619g = stringExtra;
        this.f20627o = intent.getIntExtra("com.yalantis.ucrop.UcropLogoColor", AbstractC0691Ky.m4783a(this, R.color.ucrop_color_default_logo));
        this.f20628p = !intent.getBooleanExtra("com.yalantis.ucrop.HideBottomControls", false);
        this.f20624l = intent.getIntExtra("com.yalantis.ucrop.UcropRootViewBackgroundColor", AbstractC0691Ky.m4783a(this, R.color.ucrop_color_crop_background));
        int i = this.f20621i;
        Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i);
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(this.f20620h);
        toolbar.setTitleTextColor(this.f20623k);
        TextView textView = (TextView) toolbar.findViewById(R.id.toolbar_title);
        textView.setTextColor(this.f20623k);
        textView.setText(this.f20619g);
        Drawable drawableMutate = AbstractC0628Jy.m4480b(this, this.f20625m).mutate();
        int i2 = this.f20623k;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        drawableMutate.setColorFilter(i2, mode);
        toolbar.setNavigationIcon(drawableMutate);
        m18967j(toolbar);
        FM1 fm1M18965h = m18965h();
        if (fm1M18965h != null) {
            fm1M18965h.mo2599o();
        }
        UCropView uCropView = (UCropView) findViewById(R.id.ucrop);
        this.f20630r = uCropView;
        this.f20631s = uCropView.getCropImageView();
        this.f20632t = this.f20630r.getOverlayView();
        this.f20631s.setTransformImageListener(this.f20617I);
        ((ImageView) findViewById(R.id.image_view_logo)).setColorFilter(this.f20627o, mode);
        findViewById(R.id.ucrop_frame).setBackgroundColor(this.f20624l);
        if (!this.f20628p) {
            ((RelativeLayout.LayoutParams) findViewById(R.id.ucrop_frame).getLayoutParams()).bottomMargin = 0;
            findViewById(R.id.ucrop_frame).requestLayout();
        }
        ViewGroup viewGroup = null;
        if (this.f20628p) {
            ViewGroup viewGroup2 = (ViewGroup) ((ViewGroup) findViewById(R.id.ucrop_photobox)).findViewById(R.id.controls_wrapper);
            viewGroup2.setVisibility(0);
            LayoutInflater.from(this).inflate(R.layout.ucrop_controls, viewGroup2, true);
            C6563oc c6563oc = new C6563oc();
            this.f20613E = c6563oc;
            c6563oc.mo2686D(50L);
            ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.state_aspect_ratio);
            this.f20633u = viewGroup3;
            ViewOnClickListenerC8519Xe1 viewOnClickListenerC8519Xe1 = this.f20618J;
            viewGroup3.setOnClickListener(viewOnClickListenerC8519Xe1);
            ViewGroup viewGroup4 = (ViewGroup) findViewById(R.id.state_rotate);
            this.f20634v = viewGroup4;
            viewGroup4.setOnClickListener(viewOnClickListenerC8519Xe1);
            ViewGroup viewGroup5 = (ViewGroup) findViewById(R.id.state_scale);
            this.f20635w = viewGroup5;
            viewGroup5.setOnClickListener(viewOnClickListenerC8519Xe1);
            this.f20636x = (ViewGroup) findViewById(R.id.layout_aspect_ratio);
            this.f20637y = (ViewGroup) findViewById(R.id.layout_rotate_wheel);
            this.f20638z = (ViewGroup) findViewById(R.id.layout_scale_wheel);
            int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
            if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
                parcelableArrayListExtra = new ArrayList();
                parcelableArrayListExtra.add(new C1078R8(null, 1.0f, 1.0f));
                parcelableArrayListExtra.add(new C1078R8(null, 3.0f, 4.0f));
                parcelableArrayListExtra.add(new C1078R8(getString(R.string.ucrop_label_original).toUpperCase(), 0.0f, 0.0f));
                parcelableArrayListExtra.add(new C1078R8(null, 3.0f, 2.0f));
                parcelableArrayListExtra.add(new C1078R8(null, 16.0f, 9.0f));
                intExtra = 2;
            }
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout_aspect_ratio);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 1.0f;
            Iterator it = parcelableArrayListExtra.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                arrayList = this.f20609A;
                if (!zHasNext) {
                    break;
                }
                C1078R8 c1078r8 = (C1078R8) it.next();
                FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(R.layout.ucrop_aspect_ratio, viewGroup);
                frameLayout.setLayoutParams(layoutParams);
                AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
                aspectRatioTextView.setActiveColor(this.f20622j);
                aspectRatioTextView.setAspectRatio(c1078r8);
                linearLayout.addView(frameLayout);
                arrayList.add(frameLayout);
                viewGroup = null;
            }
            ((ViewGroup) arrayList.get(intExtra)).setSelected(true);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((ViewGroup) it2.next()).setOnClickListener(new ViewOnClickListenerC8519Xe1(this, 0));
            }
            this.f20610B = (TextView) findViewById(R.id.text_view_rotate);
            ((HorizontalProgressWheelView) findViewById(R.id.rotate_scroll_wheel)).setScrollingListener(new C10525oT0(this));
            ((HorizontalProgressWheelView) findViewById(R.id.rotate_scroll_wheel)).setMiddleLineColor(this.f20622j);
            findViewById(R.id.wrapper_reset_rotate).setOnClickListener(new ViewOnClickListenerC8519Xe1(this, 1));
            findViewById(R.id.wrapper_rotate_by_angle).setOnClickListener(new ViewOnClickListenerC8519Xe1(this, 2));
            int i3 = this.f20622j;
            TextView textView2 = this.f20610B;
            if (textView2 != null) {
                textView2.setTextColor(i3);
            }
            this.f20611C = (TextView) findViewById(R.id.text_view_scale);
            ((HorizontalProgressWheelView) findViewById(R.id.scale_scroll_wheel)).setScrollingListener(new C10909rT0(this));
            ((HorizontalProgressWheelView) findViewById(R.id.scale_scroll_wheel)).setMiddleLineColor(this.f20622j);
            int i4 = this.f20622j;
            TextView textView3 = this.f20611C;
            if (textView3 != null) {
                textView3.setTextColor(i4);
            }
            ImageView imageView = (ImageView) findViewById(R.id.image_view_state_scale);
            ImageView imageView2 = (ImageView) findViewById(R.id.image_view_state_rotate);
            ImageView imageView3 = (ImageView) findViewById(R.id.image_view_state_aspect_ratio);
            imageView.setImageDrawable(new TX0(imageView.getDrawable(), this.f20622j));
            imageView2.setImageDrawable(new TX0(imageView2.getDrawable(), this.f20622j));
            imageView3.setImageDrawable(new TX0(imageView3.getDrawable(), this.f20622j));
        }
        Uri uri = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.InputUri");
        Uri uri2 = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
        String stringExtra2 = intent.getStringExtra("com.yalantis.ucrop.CompressionFormatName");
        Bitmap.CompressFormat compressFormatValueOf = !TextUtils.isEmpty(stringExtra2) ? Bitmap.CompressFormat.valueOf(stringExtra2) : null;
        if (compressFormatValueOf == null) {
            compressFormatValueOf = f20608K;
        }
        this.f20614F = compressFormatValueOf;
        this.f20615G = intent.getIntExtra("com.yalantis.ucrop.CompressionQuality", 90);
        int[] intArrayExtra = intent.getIntArrayExtra("com.yalantis.ucrop.AllowedGestures");
        if (intArrayExtra != null && intArrayExtra.length == 3) {
            this.f20616H = intArrayExtra;
        }
        this.f20631s.setMaxBitmapSize(intent.getIntExtra("com.yalantis.ucrop.MaxBitmapSize", 0));
        this.f20631s.setMaxScaleMultiplier(intent.getFloatExtra("com.yalantis.ucrop.MaxScaleMultiplier", 10.0f));
        this.f20631s.setImageToWrapCropBoundsAnimDuration(intent.getIntExtra("com.yalantis.ucrop.ImageToCropBoundsAnimDuration", 500));
        this.f20632t.setFreestyleCropEnabled(intent.getBooleanExtra("com.yalantis.ucrop.FreeStyleCrop", false));
        this.f20632t.setDimmedColor(intent.getIntExtra("com.yalantis.ucrop.DimmedLayerColor", getResources().getColor(R.color.ucrop_color_default_dimmed)));
        this.f20632t.setCircleDimmedLayer(intent.getBooleanExtra("com.yalantis.ucrop.CircleDimmedLayer", false));
        this.f20632t.setShowCropFrame(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropFrame", true));
        this.f20632t.setCropFrameColor(intent.getIntExtra("com.yalantis.ucrop.CropFrameColor", getResources().getColor(R.color.ucrop_color_default_crop_frame)));
        this.f20632t.setCropFrameStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropFrameStrokeWidth", getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_frame_stoke_width)));
        this.f20632t.setShowCropGrid(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropGrid", true));
        this.f20632t.setCropGridRowCount(intent.getIntExtra("com.yalantis.ucrop.CropGridRowCount", 2));
        this.f20632t.setCropGridColumnCount(intent.getIntExtra("com.yalantis.ucrop.CropGridColumnCount", 2));
        this.f20632t.setCropGridColor(intent.getIntExtra("com.yalantis.ucrop.CropGridColor", getResources().getColor(R.color.ucrop_color_default_crop_grid)));
        this.f20632t.setCropGridCornerColor(intent.getIntExtra("com.yalantis.ucrop.CropGridCornerColor", getResources().getColor(R.color.ucrop_color_default_crop_grid)));
        this.f20632t.setCropGridStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropGridStrokeWidth", getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_grid_stoke_width)));
        float floatExtra = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioX", 0.0f);
        float floatExtra2 = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioY", 0.0f);
        int intExtra2 = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (floatExtra > 0.0f && floatExtra2 > 0.0f) {
            ViewGroup viewGroup6 = this.f20633u;
            if (viewGroup6 != null) {
                viewGroup6.setVisibility(8);
            }
            this.f20631s.setTargetAspectRatio(floatExtra / floatExtra2);
        } else if (parcelableArrayListExtra2 == null || intExtra2 >= parcelableArrayListExtra2.size()) {
            this.f20631s.setTargetAspectRatio(0.0f);
        } else {
            this.f20631s.setTargetAspectRatio(((C1078R8) parcelableArrayListExtra2.get(intExtra2)).f10022b / ((C1078R8) parcelableArrayListExtra2.get(intExtra2)).f10023c);
        }
        int intExtra3 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeX", 0);
        int intExtra4 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeY", 0);
        if (intExtra3 > 0 && intExtra4 > 0) {
            this.f20631s.setMaxResultImageSizeX(intExtra3);
            this.f20631s.setMaxResultImageSizeY(intExtra4);
        }
        if (uri == null || uri2 == null) {
            m13760l(new NullPointerException(getString(R.string.ucrop_error_input_data_is_absent)));
            finish();
        } else {
            try {
                GestureCropImageView gestureCropImageView = this.f20631s;
                int maxBitmapSize = gestureCropImageView.getMaxBitmapSize();
                new AsyncTaskC4070fi(gestureCropImageView.getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new C10339n11(4, gestureCropImageView)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } catch (Exception e) {
                m13760l(e);
                finish();
            }
        }
        if (!this.f20628p) {
            m13759k(0);
        } else if (this.f20633u.getVisibility() == 0) {
            m13761m(R.id.state_aspect_ratio);
        } else {
            m13761m(R.id.state_scale);
        }
        if (this.f20612D == null) {
            this.f20612D = new View(this);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(3, R.id.toolbar);
            this.f20612D.setLayoutParams(layoutParams2);
            this.f20612D.setClickable(true);
        }
        ((RelativeLayout) findViewById(R.id.ucrop_photobox)).addView(this.f20612D);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.ucrop_menu_activity, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_loader);
        Drawable icon = menuItemFindItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(this.f20623k, PorterDuff.Mode.SRC_ATOP);
                menuItemFindItem.setIcon(icon);
            } catch (IllegalStateException e) {
                e.getMessage();
                getString(R.string.ucrop_mutate_exception_hint);
            }
            ((Animatable) menuItemFindItem.getIcon()).start();
        }
        MenuItem menuItemFindItem2 = menu.findItem(R.id.menu_crop);
        Drawable drawableM4480b = AbstractC0628Jy.m4480b(this, this.f20626n);
        if (drawableM4480b == null) {
            return true;
        }
        drawableM4480b.mutate();
        drawableM4480b.setColorFilter(this.f20623k, PorterDuff.Mode.SRC_ATOP);
        menuItemFindItem2.setIcon(drawableM4480b);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_crop) {
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            onBackPressed();
            return true;
        }
        this.f20612D.setClickable(true);
        this.f20629q = true;
        m18964g().mo3279a();
        GestureCropImageView gestureCropImageView = this.f20631s;
        Bitmap.CompressFormat compressFormat = this.f20614F;
        int i = this.f20615G;
        L21 l21 = new L21(4, this);
        gestureCropImageView.m22161f();
        gestureCropImageView.setImageToWrapCropBounds(false);
        RectF rectF = gestureCropImageView.f36338s;
        RectF rectFM18232d = AbstractC9366fP1.m18232d(gestureCropImageView.f41757d);
        float currentScale = gestureCropImageView.getCurrentScale();
        float currentAngle = gestureCropImageView.getCurrentAngle();
        C11249u70 c11249u70 = new C11249u70();
        c11249u70.f43528c = rectF;
        c11249u70.f43529d = rectFM18232d;
        c11249u70.f43526a = currentScale;
        c11249u70.f43527b = currentAngle;
        int i2 = gestureCropImageView.f36335B;
        int i3 = gestureCropImageView.f36336C;
        String imageInputPath = gestureCropImageView.getImageInputPath();
        String imageOutputPath = gestureCropImageView.getImageOutputPath();
        C6679qQ exifInfo = gestureCropImageView.getExifInfo();
        C6347lB c6347lB = new C6347lB();
        c6347lB.f36932a = i2;
        c6347lB.f36933b = i3;
        c6347lB.f36934c = compressFormat;
        c6347lB.f36935d = i;
        c6347lB.f36936e = imageInputPath;
        c6347lB.f36937f = imageOutputPath;
        c6347lB.f36938g = exifInfo;
        new BitmapCropTask(gestureCropImageView.getViewBitmap(), c11249u70, c6347lB, l21).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(R.id.menu_crop).setVisible(!this.f20629q);
        menu.findItem(R.id.menu_loader).setVisible(this.f20629q);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // p000.AbstractActivityC4221i6, androidx.fragment.app.AbstractActivityC1730l, android.app.Activity
    public final void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onStop();
        GestureCropImageView gestureCropImageView = this.f20631s;
        if (gestureCropImageView != null) {
            gestureCropImageView.m22161f();
        }
    }
}

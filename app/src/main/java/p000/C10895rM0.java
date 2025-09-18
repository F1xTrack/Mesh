package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.react.bridge.AssertionException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import ru.mes.dnevnik.R;

/* renamed from: rM0 */
/* loaded from: classes.dex */
public final class C10895rM0 extends C0002A1 {

    /* renamed from: d */
    public final /* synthetic */ int f41617d;

    /* renamed from: e */
    public final Object f41618e;

    public /* synthetic */ C10895rM0(int i, Object obj) {
        this.f41617d = i;
        this.f41618e = obj;
    }

    @Override // p000.C0002A1
    /* renamed from: c */
    public void mo10c(View view, AccessibilityEvent accessibilityEvent) {
        boolean zM23991i;
        View childAt;
        ReadableMap readableMap;
        switch (this.f41617d) {
            case 0:
                super.mo10c(view, accessibilityEvent);
                if (!(view instanceof ViewGroupOnHierarchyChangeListenerC10767qM0) && !(view instanceof BK0)) {
                    ReactSoftExceptionLogger.logSoftException((String) this.f41618e, new AssertionException("ReactScrollViewAccessibilityDelegate should only be used with ReactScrollView or ReactHorizontalScrollView, not with class: ".concat(view.getClass().getSimpleName())));
                    break;
                } else {
                    ReadableMap readableMap2 = (ReadableMap) view.getTag(R.id.accessibility_collection);
                    if (readableMap2 != null) {
                        accessibilityEvent.setItemCount(readableMap2.getInt("itemCount"));
                        if (view instanceof ViewGroup) {
                            View childAt2 = ((ViewGroup) view).getChildAt(0);
                            if (childAt2 instanceof ViewGroup) {
                                Integer numValueOf = null;
                                int i = 0;
                                Integer numValueOf2 = null;
                                while (true) {
                                    ViewGroup viewGroup = (ViewGroup) childAt2;
                                    if (i >= viewGroup.getChildCount()) {
                                        break;
                                    } else {
                                        View childAt3 = viewGroup.getChildAt(i);
                                        if (!(view instanceof ViewGroupOnHierarchyChangeListenerC10767qM0)) {
                                            if (!(view instanceof BK0)) {
                                                break;
                                            } else {
                                                BK0 bk0 = (BK0) view;
                                                int iM609h = bk0.m609h(childAt3);
                                                Rect rect = bk0.f729K;
                                                childAt3.getDrawingRect(rect);
                                                zM23991i = iM609h != 0 && Math.abs(iM609h) < rect.width();
                                            }
                                        } else {
                                            zM23991i = ((ViewGroupOnHierarchyChangeListenerC10767qM0) view).m23991i(childAt3);
                                        }
                                        ReadableMap readableMap3 = (ReadableMap) childAt3.getTag(R.id.accessibility_collection_item);
                                        if (!(childAt3 instanceof ViewGroup)) {
                                            break;
                                        } else {
                                            ViewGroup viewGroup2 = (ViewGroup) childAt3;
                                            if (viewGroup2.getChildCount() > 0 && readableMap3 == null && (childAt = viewGroup2.getChildAt(0)) != null && (readableMap = (ReadableMap) childAt.getTag(R.id.accessibility_collection_item)) != null) {
                                                readableMap3 = readableMap;
                                            }
                                            if (zM23991i && readableMap3 != null) {
                                                if (numValueOf == null) {
                                                    numValueOf = Integer.valueOf(readableMap3.getInt("itemIndex"));
                                                }
                                                numValueOf2 = Integer.valueOf(readableMap3.getInt("itemIndex"));
                                            }
                                            if (numValueOf != null && numValueOf2 != null) {
                                                accessibilityEvent.setFromIndex(numValueOf.intValue());
                                                accessibilityEvent.setToIndex(numValueOf2.intValue());
                                            }
                                            i++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                super.mo10c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f41618e).f18216d);
                break;
            default:
                super.mo10c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p000.C0002A1
    /* renamed from: d */
    public final void mo11d(C1009Q1 c1009q1, View view) {
        int i;
        Object obj = this.f41618e;
        View.AccessibilityDelegate accessibilityDelegate = this.f11a;
        switch (this.f41617d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = c1009q1.f9401a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (!(view instanceof ViewGroupOnHierarchyChangeListenerC10767qM0) && !(view instanceof BK0)) {
                    ReactSoftExceptionLogger.logSoftException((String) obj, new AssertionException("ReactScrollViewAccessibilityDelegate should only be used with ReactScrollView or ReactHorizontalScrollView, not with class: ".concat(view.getClass().getSimpleName())));
                    break;
                } else {
                    EnumC11528wJ0 enumC11528wJ0M25594b = EnumC11528wJ0.m25594b(view);
                    if (enumC11528wJ0M25594b != null) {
                        C11782yJ0.m26119A(c1009q1, enumC11528wJ0M25594b, view.getContext());
                    }
                    ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_collection);
                    if (readableMap != null) {
                        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(readableMap.getInt("rowCount"), readableMap.getInt("columnCount"), readableMap.getBoolean("hierarchical")));
                    }
                    if (view instanceof ViewGroupOnHierarchyChangeListenerC10767qM0) {
                        c1009q1.m6543o(((ViewGroupOnHierarchyChangeListenerC10767qM0) view).getScrollEnabled());
                        break;
                    } else if (view instanceof BK0) {
                        c1009q1.m6543o(((BK0) view).getScrollEnabled());
                        break;
                    }
                }
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c1009q1.f9401a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.f18217e);
                accessibilityNodeInfo2.setChecked(checkableImageButton.f18216d);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = c1009q1.f9401a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                int i2 = MaterialButtonToggleGroup.f18162k;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < materialButtonToggleGroup.getChildCount(); i4++) {
                        if (materialButtonToggleGroup.getChildAt(i4) == view) {
                            i = i3;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.m11221c(i4)) {
                                i3++;
                            }
                        }
                    }
                    i = -1;
                } else {
                    i = -1;
                }
                accessibilityNodeInfo3.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).f18159o));
                break;
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c1009q1.f9401a);
                C8898bo0 c8898bo0 = (C8898bo0) obj;
                c1009q1.m6541m(c8898bo0.f17171m.getVisibility() == 0 ? c8898bo0.getString(R.string.mtrl_picker_toggle_to_year_selection) : c8898bo0.getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo4 = c1009q1.f9401a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setCheckable(((NavigationMenuItemView) obj).f18228x);
                break;
        }
    }

    public C10895rM0() {
        this.f41617d = 0;
        this.f41618e = C10895rM0.class.getSimpleName();
    }
}

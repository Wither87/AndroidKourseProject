// Generated by Dagger (https://dagger.dev).
package com.example.courseproject.di;

import androidx.lifecycle.ViewModel;
import com.example.courseproject.MainActivity;
import com.example.courseproject.ViewModelFactory;
import com.example.courseproject.ui.home.HomeFragment;
import com.example.courseproject.ui.home.HomeFragment_MembersInjector;
import com.example.courseproject.ui.home.HomeViewModel;
import com.example.courseproject.ui.home.HomeViewModel_Factory;
import com.example.courseproject.ui.phone.PhoneFragment;
import com.example.courseproject.ui.phone.PhoneFragment_MembersInjector;
import com.example.courseproject.ui.phone.PhoneViewModel;
import com.example.courseproject.ui.phone.PhoneViewModel_Factory;
import com.example.courseproject.ui.phonedetails.PhoneDetailsFragment;
import com.example.courseproject.ui.phonedetails.PhoneDetailsFragment_MembersInjector;
import com.example.courseproject.ui.phonedetails.PhoneDetailsViewModel;
import com.example.courseproject.ui.phonedetails.PhoneDetailsViewModel_Factory;
import com.example.data.api.RetrofitService;
import com.example.data.repository.BrandsRepositoryImpl;
import com.example.data.repository.BrandsRepositoryImpl_Factory;
import com.example.data.repository.PhoneDetailsRepositoryImpl;
import com.example.data.repository.PhoneDetailsRepositoryImpl_Factory;
import com.example.data.repository.PhoneRepositoryImpl;
import com.example.data.repository.PhoneRepositoryImpl_Factory;
import com.example.domain.usecases.GetBrandsListUseCaseImpl;
import com.example.domain.usecases.GetBrandsListUseCaseImpl_Factory;
import com.example.domain.usecases.GetPhoneDetailsUseCaseImpl;
import com.example.domain.usecases.GetPhoneDetailsUseCaseImpl_Factory;
import com.example.domain.usecases.GetPhonesUseCaseImpl;
import com.example.domain.usecases.GetPhonesUseCaseImpl_Factory;
import dagger.internal.DaggerGenerated;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private final DaggerAppComponent appComponent = this;

  private Provider<RetrofitService> provideRetrofitServiceProvider;

  private Provider<BrandsRepositoryImpl> brandsRepositoryImplProvider;

  private Provider<GetBrandsListUseCaseImpl> getBrandsListUseCaseImplProvider;

  private Provider<HomeViewModel> homeViewModelProvider;

  private Provider<PhoneRepositoryImpl> phoneRepositoryImplProvider;

  private Provider<GetPhonesUseCaseImpl> getPhonesUseCaseImplProvider;

  private Provider<PhoneViewModel> phoneViewModelProvider;

  private Provider<PhoneDetailsRepositoryImpl> phoneDetailsRepositoryImplProvider;

  private Provider<GetPhoneDetailsUseCaseImpl> getPhoneDetailsUseCaseImplProvider;

  private Provider<PhoneDetailsViewModel> phoneDetailsViewModelProvider;

  private DaggerAppComponent(NetworkModule networkModuleParam) {

    initialize(networkModuleParam);

  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return new Builder().build();
  }

  private Map<Class<? extends ViewModel>, Provider<ViewModel>> mapOfClassOfAndProviderOfViewModel(
      ) {
    return MapBuilder.<Class<? extends ViewModel>, Provider<ViewModel>>newMapBuilder(3).put(HomeViewModel.class, (Provider) homeViewModelProvider).put(PhoneViewModel.class, (Provider) phoneViewModelProvider).put(PhoneDetailsViewModel.class, (Provider) phoneDetailsViewModelProvider).build();
  }

  private ViewModelFactory viewModelFactory() {
    return new ViewModelFactory(mapOfClassOfAndProviderOfViewModel());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final NetworkModule networkModuleParam) {
    this.provideRetrofitServiceProvider = NetworkModule_ProvideRetrofitServiceFactory.create(networkModuleParam);
    this.brandsRepositoryImplProvider = BrandsRepositoryImpl_Factory.create(provideRetrofitServiceProvider);
    this.getBrandsListUseCaseImplProvider = GetBrandsListUseCaseImpl_Factory.create((Provider) brandsRepositoryImplProvider);
    this.homeViewModelProvider = HomeViewModel_Factory.create((Provider) getBrandsListUseCaseImplProvider);
    this.phoneRepositoryImplProvider = PhoneRepositoryImpl_Factory.create(provideRetrofitServiceProvider);
    this.getPhonesUseCaseImplProvider = GetPhonesUseCaseImpl_Factory.create((Provider) phoneRepositoryImplProvider);
    this.phoneViewModelProvider = PhoneViewModel_Factory.create((Provider) getPhonesUseCaseImplProvider);
    this.phoneDetailsRepositoryImplProvider = PhoneDetailsRepositoryImpl_Factory.create(provideRetrofitServiceProvider);
    this.getPhoneDetailsUseCaseImplProvider = GetPhoneDetailsUseCaseImpl_Factory.create((Provider) phoneDetailsRepositoryImplProvider);
    this.phoneDetailsViewModelProvider = PhoneDetailsViewModel_Factory.create((Provider) getPhoneDetailsUseCaseImplProvider);
  }

  @Override
  public void inject(MainActivity activity) {
  }

  @Override
  public void inject(HomeFragment HomeFragment) {
    injectHomeFragment(HomeFragment);
  }

  @Override
  public void inject(PhoneFragment phoneFragment) {
    injectPhoneFragment(phoneFragment);
  }

  @Override
  public void inject(PhoneDetailsFragment phoneDetailsFragment) {
    injectPhoneDetailsFragment(phoneDetailsFragment);
  }

  private HomeFragment injectHomeFragment(HomeFragment instance) {
    HomeFragment_MembersInjector.injectViewModelFactory(instance, viewModelFactory());
    return instance;
  }

  private PhoneFragment injectPhoneFragment(PhoneFragment instance) {
    PhoneFragment_MembersInjector.injectViewModelFactory(instance, viewModelFactory());
    return instance;
  }

  private PhoneDetailsFragment injectPhoneDetailsFragment(PhoneDetailsFragment instance) {
    PhoneDetailsFragment_MembersInjector.injectViewModelFactory(instance, viewModelFactory());
    return instance;
  }

  public static final class Builder {
    private NetworkModule networkModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }

    public AppComponent build() {
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      return new DaggerAppComponent(networkModule);
    }
  }
}

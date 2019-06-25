package EnvironmentSetup;

public class UrlHolder {

// Ring Fence Controller End points
     public static final String GET_RINGFENCES      =  "/getRingFences";
     public static final String GET_RINGFENCE       =  "/getRingFence";
     public static final String SAVE_RINGFENCES     =  "/saveRingFence";
     public static final String DELETE_RINGFENCE   =  "/deleteRingFence";
     public static final String UPDATE_RINGFENCES  =  "/updateRingFences";
     public static final String GET_COUNTRIES_FOR_PRODUCTRINGFENCE = "/getCountriesForProductRingFence";
     // Multiple Account Range End Points
     public static final String WITHDRAW_MULTIPLE = "/account-range-management/withdraw";
     public static final String UPDATE_MULTIPLE = "/account-range-management/update";
     public static final String TRANSFER_MULTIPLE = "account-range-management/transfer";
     public static final String SAVE_MULTIPLE   = "/account-range-management/add";
     //Un Used Bin Space Controller
    public static final String UNUSED_SPACE_BIN_ACCOUNTRANGE = "/unusedSpaceBinAccountRange";
    //Review Bin Controller
    public static final String UPDATE_AR_FOR_REVIEWBIN =  "/accountRange/updateAccountRangeForReviewBin";
    //Product Controller
    public static final String GET_AVAILABLE_PRODUCTS = "/getAvailableProducts";
//Product Country Bin Availability Controller
    public static final String DELETE_PRD_CNTRY_BIN = "/deletePrdctCntryBin";
    public static final String GET_COUNTRIES_ISSUANCE = "/getAllCountriesIssuance";
    public static final String GET_PRDOUCTS_ISSUANCE = "/getAllProductsIssuance";
    public static final String GET_REGIONS_ISSUANCE = "/getAllRegionIssuance";
    public static final String GET_BINSERIES_ISSUANCE = "/getBinSeriesIssuance";
    public static final String GET_PRDCNTRY_BIN_AVAILABILITY = "/getPrdctCntryBinAvaibility";
    public static final String SAVE_PRDCNTRY_BIN = "/savePrdctCntryBin";
    //Product Bin Sharing Group Controller
    public static final String DELETE_PRODUCT_BINSHARING_GROUP = "/deleteProductBinSharingGroup";
    public static final String EDIT_PRODUCT_BINSHARING_GROUP = "/editProductBinSharingGroup";
    public static final String GET_ALL_BINSHARING_COUNTRIES = "/getAllBinSharingCountries";
    public static final String GET_ALL_BINSHARING_NAMES = "/getAllBinSharingNames";
    public static final String GET_ALL_BINSHARING_PRODUCTS = "/getAllBinSharingProducts";
    public static final String GET_PRODUCT_BINSHARING_GROUP = "/getProductBinSharingGroup";
    public static final String GET_PRODUCT_LIST = "/getProductBinSharingProductList";
    public static final String SAVE_PRODUCT_BINSHARING_GROUP = "/saveProductBinSharingGroup";
    // Country Config Controller
    public static final String DELETE_COUNTRY_CAT_ASSIGN = "/deleteCountryCatAssign";
    public static final String GET_COUNTRY_CAT_ASSIGN = "/getCountryCatAssign";
    public static final String GET_COUNTRY_CATEGORY_COL = "/getCountryCategoryColumn";
    public static final String GET_COUNTRIES_LIST = "/getCountryList";
    public static final String SAVE_COUNTRY_CATEGORY = "/saveCountryCatAssign";
    //Asset Management Controller
    public static final String FETCH_BIN_SERIES = "/fetchBinSeries";
    public static final String FIND_ACCOUNT_RANGE = "/findAccountRange";
    public static final String FIND_ASSIGNED_ACCOUNTRANGES_FOR_ICAs = "/findAssignedAccountRangesForIcas";
    public static final String FIND_COUNTRIES_IN_SAME_GROUP = "/findCountriesInSameGroup";
    public static final String FIND_ORPHAN_ICAS = "/findOrphanIcas";
    public static final String GET_ACCOUNTRANGE_RECOMMENDATIONS ="/getAccountRangeRecommendations";
    public static final String GET_ALL_PRODUCT_CATEGORIES ="/getAllProductcategories";
    public static final String GET_ALL_PRODUCT_FAMILY = "/getAllProductFamily";
    public static final String GET_ASSIGNED_AFFILIATES = "/getAssignedAffiliates";
    public static final String GET_ASSIGNED_COUNTRIES = "/getAssignedCountries";
    public static final String GET_ASSIGNED_ICAS = "/getAssignedIcas";
    public static final String GET_ASSIGNED_NICKNAMES = "/getAssignedNicknames";
    public static final String GET_ASSIGNED_PRODUCT_CATEGORIES = "/getAssignedProductCategories";
    public static final String GET_ASSIGNED_PRODUCTS = "/getAssignedProducts";
    public static final String GET_COUNTRY_PRODUCT_VALIDATION = "/getCountryProductValidation";
    public static final String GET_FILTER_PRODUCTS ="/getFilterProducts";
    public static final String GET_MULTI_ACCOUNTRANGE_RECOMMENDATIONS = "/getMultiAccountRangeRecommendations";
    public static final String GET_NEW_BIN_RECOMMENDATION = "/getNewBinRecommendation";
    public static final String GET_PRODUCT_CATEGORIES = "/getProductCategories";
    public static final String GET_PRODUCTS = "/getProducts";
    public static final String UPDATE_BRANDS = "/updateBrands";
    public static final String SAVE_PRODUCT_CATEGORIES = "/updateProductCategoriesAssign";
    public static final String UPDATE_PRODUCT_STATUS = "/updateProductStatus";
    public static final String VALIDATE_DELETE = "/validateDelete";
    public static final String VALIDATE_OVERLAPPING_ACCOUNTRANGE = "/validateOverLappingAccountRange";
    public static final String VALIDATE_TRANSFER = "/validateTransfer";
    //Account Range Controller
    public static final String SEARCH_COMPANYIDS_BY_BINS = "/accountRanges/searchReport/companyIdsByBINs";
    public static final String MANAGE_ACCOUNTRANGE = "/accountRange/manage";
    public static final String DELETE_ACCOUNTRANGE = "/accountRange/delete";
    public static final String GET_ACCOUNTRANGES = "/accountRanges/searchReport";
    public static final String GET_HISTORY_ACCOUNTRANGE = "/accountRanges/history-detail";
    public static final String SAVE_ACCOUNTRANGES = "/accountRange/exception/manage";
    public static final String MARK_STATUS_LIVE =  "/accountRange/manage/markStatusLive";
    public static final String GET_PORTFOLIO_HISTORY = "/accountRanges/portfolio-history-report";


}

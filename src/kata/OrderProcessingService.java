package kata;

public class OrderProcessingService implements IOrderProcessingService {

	@Override
	public String generatePackingSlip() {
		return "Generate a packing slip for shipping";
	}

	@Override
	public String duplicatePackingSlip() {
		return "Create a duplicate packing slip for the royalty department";
	}

	@Override
	public String activateMembership() {
		return "Activate membership";
	}

	@Override
	public String updateMembership() {
		return "Update membership";
	}

	@Override
	public String emailOwner() {
		return "Email owner";
	}

	@Override
	public String addFreeVideo() {
		return "Add a free First Aid video";
	}

	@Override
	public String generateCommissionPayment() {
		return "Generate a commission payment";
	}

}
